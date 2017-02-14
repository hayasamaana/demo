package geometry.petri.geometry.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import geometry.petri.geometry.Geometry;
import geometry.petri.geometry.Line;
import geometry.petri.geometry.diagram.edit.parts.GeometryEditPart;
import geometry.petri.geometry.diagram.edit.parts.LineEditPart;
import geometry.petri.geometry.diagram.edit.parts.LineIdEditPart;
import geometry.petri.geometry.diagram.edit.parts.PointEditPart;
import geometry.petri.geometry.diagram.edit.parts.PointIdEditPart;
import geometry.petri.geometry.diagram.part.GeometryDiagramEditorPlugin;
import geometry.petri.geometry.diagram.part.GeometryVisualIDRegistry;
import geometry.petri.geometry.diagram.providers.GeometryElementTypes;
import geometry.petri.geometry.diagram.providers.GeometryParserProvider;

/**
 * @generated
 */
public class GeometryNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		GeometryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		GeometryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GeometryNavigatorItem && !isOwnView(((GeometryNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return GeometryDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://geometry.net?Geometry", GeometryElementTypes.Geometry_1000); //$NON-NLS-1$
		case PointEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://geometry.net?Point", GeometryElementTypes.Point_2001); //$NON-NLS-1$
		case LineEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://geometry.net?Line", GeometryElementTypes.Line_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GeometryDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GeometryElementTypes.isKnownElementType(elementType)) {
			image = GeometryElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2001Text(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getGeometry_1000Text(View view) {
		Geometry domainModelElement = (Geometry) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPoint_2001Text(View view) {
		IParser parser = GeometryParserProvider.getParser(GeometryElementTypes.Point_2001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry.getType(PointIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLine_4001Text(View view) {
		IParser parser = GeometryParserProvider.getParser(GeometryElementTypes.Line_4001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry.getType(LineIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry.getModelID(view));
	}

}
