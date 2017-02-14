package geometry.petri.geometry.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import geometry.petri.geometry.GeometryPackage;
import geometry.petri.geometry.diagram.edit.parts.LineIdEditPart;
import geometry.petri.geometry.diagram.edit.parts.PointIdEditPart;
import geometry.petri.geometry.diagram.parsers.MessageFormatParser;
import geometry.petri.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser pointId_5001Parser;

	/**
	* @generated
	*/
	private IParser getPointId_5001Parser() {
		if (pointId_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE.getGeoObject_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pointId_5001Parser = parser;
		}
		return pointId_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser lineId_6001Parser;

	/**
	* @generated
	*/
	private IParser getLineId_6001Parser() {
		if (lineId_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE.getGeoObject_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lineId_6001Parser = parser;
		}
		return lineId_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PointIdEditPart.VISUAL_ID:
			return getPointId_5001Parser();
		case LineIdEditPart.VISUAL_ID:
			return getLineId_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GeometryVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GeometryVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GeometryElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
