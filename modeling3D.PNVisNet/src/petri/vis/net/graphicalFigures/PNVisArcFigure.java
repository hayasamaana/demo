package petri.vis.net.graphicalFigures;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import petri.vis.net.PNVisNet.Arc;
import petri.vis.net.PNVisNet.IdentityAttribute;

/**
 * @generated
 * @author haya
 *
 */
public class PNVisArcFigure extends ArcFigure {

	private Arc arc;
	private Color idColor;
	private Color userColor;
	
	public PNVisArcFigure(Arc arc) {
		super(arc);
		// TODO Auto-generated constructor stub
		this.arc=arc;
		this.setLineStyle(Graphics.LINE_SOLID);
		userColor=this.getForegroundColor();
		update();
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		IdentityAttribute identity=arc.getIdentity();
		if(identity !=null){
			if(identity.getText()==0){
				idColor=ColorConstants.red;		
			}
			else if(identity.getText()==1){
				idColor=ColorConstants.green;
			}
			else if(identity.getText()==2){
				idColor=ColorConstants.blue;
			}
			else if(identity.getText()==3){
				idColor=ColorConstants.orange;
			}
			else if(identity.getText()==4){
				idColor=ColorConstants.cyan;
			}
			else if(identity.getText()==5){
				idColor=ColorConstants.lightBlue;
			}
			else{
				idColor=ColorConstants.black;
			}
			super.setForegroundColor(idColor);
			
		}
		else{
			if(idColor!=null){
				super.setForegroundColor(userColor);
				idColor=null;
			}
		}
	}
	
	

}
