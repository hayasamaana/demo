package modeling3d.command;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import geometry.petri.geometry.Geometry;
import geometry.petri.geometry.Line;
import geometry.petri.geometry.Point;
import geometry.petri.geometry.Position;

public class CountHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		int countline=0,countpoint=0,countintermediat=0;
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				Geometry geometry = getGeometry(structuredSelection.getFirstElement());
				if (geometry != null) {
					for(Line obj:geometry.getLines()){
						Line line=(Line) obj;
					    countline++;
					    for(Position pos:line.getIntermediate()){
					    	countintermediat++;
					    	
					    }
					}
					for(Point obj:geometry.getPoints()){
					    countpoint++;
					}
					String message="Lines="+geometry.getLines().size()+" Points="+geometry.getPoints().size();
					String message1 = "The number of lines ="+countline+"The number of points="+countpoint+"The number of intermediates"+countintermediat;
					// TODO imlement counting of points, lines and intermediate poins and
					//      generate a String message from it.
					MessageDialog.openInformation(null, "Geometry statistics", message);
					MessageDialog.openInformation(null, "Geometry statistics", message1);
				}
			}
		}
		return null;
	}
	
	private boolean enabled = true;
	
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
	@Override
	public void setEnabled(Object evaluationContext) {
		Object object = ((IEvaluationContext) evaluationContext).getDefaultVariable();
		if (object instanceof List) {
			@SuppressWarnings("rawtypes")
			List list = (List) object;
			if (list.size() == 1) {
				Geometry geometry = getGeometry(list.get(0));;
				if (geometry != null) {
					enabled = true;
					return;
				}
			}
		}
		enabled = false;
	}

	private static Geometry getGeometry(Object object) {
		if (object instanceof Geometry) {// emf
			return (Geometry) object;
		} else if (object instanceof IAdaptable) {  //gmf
			return ((IAdaptable) object).getAdapter(Geometry.class);
		}
		return null;
	}

}