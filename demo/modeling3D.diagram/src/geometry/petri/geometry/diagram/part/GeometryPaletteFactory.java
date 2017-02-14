
package geometry.petri.geometry.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import geometry.petri.geometry.diagram.providers.GeometryElementTypes;

/**
 * @generated
 */
public class GeometryPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeometry1Group());
	}

	/**
	* Creates "geometry" palette tool group
	* @generated
	*/
	private PaletteContainer createGeometry1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Geometry1Group_title);
		paletteContainer.setId("createGeometry1Group"); //$NON-NLS-1$
		paletteContainer.add(createPoint1CreationTool());
		paletteContainer.add(createLine2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createPoint1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Point1CreationTool_title,
				Messages.Point1CreationTool_desc, Collections.singletonList(GeometryElementTypes.Point_2001));
		entry.setId("createPoint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes.getImageDescriptor(GeometryElementTypes.Point_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLine2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Line2CreationTool_title,
				Messages.Line2CreationTool_desc, Collections.singletonList(GeometryElementTypes.Line_4001));
		entry.setId("createLine2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes.getImageDescriptor(GeometryElementTypes.Line_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
