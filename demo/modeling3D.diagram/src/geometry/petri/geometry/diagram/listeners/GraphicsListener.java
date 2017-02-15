package geometry.petri.geometry.diagram.listeners;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterNodeDescriptor;

import geometry.petri.geometry.Line;
import geometry.petri.geometry.Point;
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
						
					}
					else if(eNotifier instanceof RelativeBendpoints && view instanceof Edge && modelElement instanceof Line){
						
					}
				
					
					// TODO if the update is an update of the routing style,
					//      the operation should be cancelled:
					//      throw new OperationCanceledException();
	
				}
			}
		}
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
