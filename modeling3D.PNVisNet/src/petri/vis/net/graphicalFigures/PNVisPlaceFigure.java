package petri.vis.net.graphicalFigures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;


import petri.vis.net.PNVisNet.MarkingAttribute;
import petri.vis.net.PNVisNet.Place;
/**
 * @generated NOT
 * @author haya
 *
 */
public class PNVisPlaceFigure extends PlaceFigure {

	private Place place;
	public PNVisPlaceFigure(Place place) {
		super(place);
		// TODO Auto-generated constructor stub
		this.place=place;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.repaint();
	}
	@Override
	protected void fillShape(Graphics graphics) {
		// TODO Auto-generated method stub
		super.fillShape(graphics);
		boolean marked=false;
		MarkingAttribute marking=place.getMarking();
		if(marking !=null){
			marked=marking.isText();
			
		}
		
	if(marked){
		Rectangle rectangle=this.getClientArea();
		graphics.setBackgroundColor(getForegroundColor());
		graphics.fillOval((int)(rectangle.x+0.3*rectangle.width),(int)(rectangle.y*rectangle.height),(int)(0.4*rectangle.width),(int)(0.4*rectangle.height));
		
	}
	}
}
