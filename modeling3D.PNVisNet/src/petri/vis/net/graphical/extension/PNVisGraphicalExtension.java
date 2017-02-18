package petri.vis.net.graphical.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;


import petri.vis.net.PNVisNet.Arc;
import petri.vis.net.PNVisNet.PNVisNetPackage;
import petri.vis.net.PNVisNet.Place;
import petri.vis.net.graphicalFigures.PNVisArcFigure;
import petri.vis.net.graphicalFigures.PNVisPlaceFigure;
/**
 * @generated NOT
 * @author haya
 *
 */
public class PNVisGraphicalExtension extends GraphicalExtension {
	@Override
	// return a singleton list with your petri net type
	public List<EClass> getExtendedNetTypes() {
		// TODO Auto-generated method stub
		ArrayList<EClass> list=new ArrayList<EClass>();
		list.add(PNVisNetPackage.eINSTANCE.getPNVis());
		return list;
	}
	// return list with all classes in your petri net-- Arc Transition Place
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		// TODO Auto-generated method stub
		ArrayList<EClass> list=new ArrayList<EClass>();
		if(netType.equals(PNVisNetPackage.eINSTANCE.getPNVis())){
			list.add(PNVisNetPackage.eINSTANCE.getArc());
			list.add(PNVisNetPackage.eINSTANCE.getPlace());
			list.add(PNVisNetPackage.eINSTANCE.getTransition());
		}
		return list;
	}

	@Override
	public IArcFigure createArcFigure(org.pnml.tools.epnk.pnmlcoremodel.Arc arc) {
		// TODO Auto-generated method stub
		if(arc instanceof Arc){
		 return new PNVisArcFigure((Arc)arc);
		}
	 return null;
	}
	@Override
	public IUpdateableFigure createPlaceFigure(org.pnml.tools.epnk.pnmlcoremodel.Place place) {
		// TODO Auto-generated method stub
		if(place instanceof Place){
			 return new PNVisPlaceFigure((Place) place);
		}
		return null;
	}
}
