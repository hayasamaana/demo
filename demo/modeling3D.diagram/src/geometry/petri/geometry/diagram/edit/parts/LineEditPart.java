package geometry.petri.geometry.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;

import geometry.petri.geometry.Line;
import geometry.petri.geometry.LineType;
import geometry.petri.geometry.diagram.edit.helpers.QuadraticBezier;
import geometry.petri.geometry.diagram.edit.policies.LineItemSemanticEditPolicy;

/**
 * @generated
 */
public class LineEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4001;

	/**
	* @generated
	*/
	public LineEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new LineItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated 
	*/

	protected Connection createConnectionFigureGen() {
		return new LineFigure();
	}
	/**
	* @generated NOT
	*/

	
	protected Connection createConnectionFigure() {
		Object model=this.getModel();
		if(model instanceof Connector){
			EObject element=((Connector)model).getElement();
			if(element instanceof Line){
				return new LineFigure((Line) element);
				
			}
		}
		return createConnectionFigureGen();
	}
	/**
	* @generated
	*/
	public LineFigure getPrimaryShape() {
		return (LineFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LineFigure extends PolylineConnectionEx {
		/**
		 * @generated NOT
		 */
				private Line line=null;
				/**
		/**
		 * @generated 
		 */
		public LineFigure() {

			setTargetDecoration(createTargetDecoration());
		}
		
		/**
		 * Constructor that adds the underlying element model(line) to figure 
		 * so that the figure can use the line attribute type (CURVER,STRAIGHT) for displaying it
		 * @generated NOT
		 */
	public LineFigure(Line line) {
		
		this();
		this.line=line;
		}

		 /** 
		  * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}
		
		/**
		 * @generated NOT
		 */
		@Override
		public PointList getSmoothPoints(boolean calculateAppox) {
			// TODO Auto-generated method stub
			if(line !=null && LineType.CURVED.equals(line.getType())){
				return QuadraticBezier.allPoints(this.getPoints());
			}
			return super.getSmoothPoints(calculateAppox);
		}
	}

}
