package geometry.petri.geometry.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import geometry.petri.geometry.diagram.providers.GeometryElementTypes;
import geometry.petri.geometry.diagram.providers.GeometryModelingAssistantProvider;

/**
 * @generated
 */
public class GeometryModelingAssistantProviderOfGeometryEditPart extends GeometryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GeometryElementTypes.Point_2001);
		return types;
	}

}
