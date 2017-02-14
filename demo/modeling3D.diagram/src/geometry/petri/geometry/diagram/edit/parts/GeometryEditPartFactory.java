package geometry.petri.geometry.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import geometry.petri.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GeometryVisualIDRegistry.getVisualID(view)) {

			case GeometryEditPart.VISUAL_ID:
				return new GeometryEditPart(view);

			case PointEditPart.VISUAL_ID:
				return new PointEditPart(view);

			case PointIdEditPart.VISUAL_ID:
				return new PointIdEditPart(view);

			case LineEditPart.VISUAL_ID:
				return new LineEditPart(view);

			case LineIdEditPart.VISUAL_ID:
				return new LineIdEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
