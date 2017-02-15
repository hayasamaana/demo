package geometry.petri.geometry.diagram.listeners;

import java.util.List;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterNodeDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;

import geometry.petri.geometry.GeometryFactory;
import geometry.petri.geometry.GeometryPackage;
import geometry.petri.geometry.Line;
import geometry.petri.geometry.Point;
import geometry.petri.geometry.Position;
/**
 * @generated NOT
 * @author haya
 *
 */
public class GraphicsListener extends EContentAdapter {
	
	private NotificationFilter ModifiedFilter;

	public GraphicsListener() {
		
		ModifiedFilter = NotificationFilter.createEventTypeFilter(Notification.SET).or
				(NotificationFilter.createEventTypeFilter(Notification.UNSET))
				.or(NotificationFilter.createEventTypeFilter(
				Notification.ADD)).
				or(NotificationFilter.createEventTypeFilter(
						Notification.REMOVE));
	}

	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			super.notifyChanged(notification);
		}
		if (ModifiedFilter.matches(notification)
				&& (notification instanceof ENotificationImpl)
				&& (notification.getNotifier() instanceof EObject)) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof EObject) {
				EObject eNotifier = (EObject) notifier;
				EObject container = eNotifier.eContainer();
				if (container instanceof View && !(container instanceof DecorationNode)) {
					View view = (View) container;
					EObject modelElement = view.getElement();
					
					// TODO check the different update possibilities and update
					//      the model accordingly
					if(eNotifier instanceof Bounds && view instanceof Node && modelElement instanceof Point ){
						updatePointPosition((Node)view,(Point)modelElement);
					}
					else if(eNotifier instanceof RelativeBendpoints && view instanceof Edge && modelElement instanceof Line){
						updateIntermediatePosition((Edge)view,(Line)modelElement);
					}
				
					else if(eNotifier instanceof Connector && notification.getFeature() instanceof EStructuralFeature){
						// in case some feature of diagram connector that concern the style of line are changed then the operation is cancled
						// TODO if the update is an update of the routing style,
						//      the operation should be cancelled:
						//      throw new OperationCanceledException();
						//throw new OperationCanceledException();
						
						preventChangingLineStyle((Connector)eNotifier, (EStructuralFeature)notification.getFeature());
						
					}
					
	
				}
			}
		}
	}
		
	
	private void updateIntermediatePosition(Edge edge, Line line) {
		// TODO Auto-generated method stub
		Bendpoints bendpoints=edge.getBendpoints();
		View source=edge.getSource();
		if(source instanceof Node && bendpoints instanceof RelativeBendpoints ){
			LayoutConstraint layout=((Node)source).getLayoutConstraint();
			if(layout instanceof Bounds){
				RelativeBendpoints relativeBendpoints=(RelativeBendpoints) bendpoints;
				List points=relativeBendpoints.getPoints();
				//delete all intermediate positions from line
				line.getIntermediate().clear();
				//and compute the new intermediate positions from the bendpoints of diagram elements(RelativeBendpoints)
				//and add them to line
				// skip the start and end bendpoint since the Gmf inserts an implecit benpoint to source and target node
				for(int i=1;i+1<points.size();i++){
					Object object=points.get(i);
					if(object instanceof RelativeBendpoints){
						Position pos=createPosition((Bounds)layout,(RelativeBendpoints)object);
						line.getIntermediate().add(pos);
						
					}
					
				}
				
				
			}
		}
	}

	private Position createPosition(Bounds sourceBounds, RelativeBendpoints bendPoints) {
		// TODO Auto-generated method stub
		int width=sourceBounds.getWidth();
		int hight=sourceBounds.getHeight();
		if(width<0) width=10; // if not defined set to preferd size of point as in gmf graphics 
		if(hight<0)hight=10;
		float cx=(float) (sourceBounds.getX()+width/2.0); // set center 
		float cy=(float) (sourceBounds.getY()+hight/2.0);
		// compute absolute position of bendpoint
		float x=cx+((Position) bendPoints).getX();
		float y=cy+((Position) bendPoints).getY();
		Position position=GeometryFactory.eINSTANCE.createPosition();
		updatePosition(position, x, y);
		return position;
	}

	private void updatePointPosition(Node view, Point point) {
		// TODO Auto-generated method stub
		LayoutConstraint layout=view.getLayoutConstraint();
		if(layout instanceof Bounds){
			Bounds bound=(Bounds) layout;
			int width=bound.getWidth();
			int hight=bound.getHeight();
			if(width<0) width=10; // if not defined set to preferd size of point as in gmf graphics 
			if(hight<0)hight=10;
			float x=(float) (bound.getX()+width/2.0); // set center 
			float y=(float) (bound.getY()+hight/2.0);
			updatePosition(point,x,y);
			
		}
		
	}

	private void updatePosition(Position pos, float x, float y) {// point ISA position
		// TODO Auto-generated method stub
		
		pos.setX(x);
		pos.setY(y);
	}

	private void preventChangingLineStyle(Connector style, EStructuralFeature feature) {
		if (feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_Smoothness()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_Routing()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_AvoidObstructions()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_ClosestDistance()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_JumpLinkStatus()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_JumpLinkType()) ||
				feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_JumpLinksReverse())
				) {
			// Aborts the operation in case the user tries to set some unsupported 
			// connection styles. This is a quick and dirty solution.
			throw new OperationCanceledException("Routing styles of the line should not be changed!");
		}
	}
}
