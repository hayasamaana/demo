package geometry.petri.geometry.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import geometry.petri.geometry.diagram.edit.parts.GeometryEditPart;
import geometry.petri.geometry.diagram.edit.parts.GeometryEditPartFactory;
import geometry.petri.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GeometryEditPartProvider() {
		super(new GeometryEditPartFactory(), GeometryVisualIDRegistry.TYPED_INSTANCE, GeometryEditPart.MODEL_ID);
	}

}
