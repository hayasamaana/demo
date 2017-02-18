package petri.vis.net.validation;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;

import petri.vis.net.PNVisNet.Arc;
import petri.vis.net.PNVisNet.IdentityAttribute;
import petri.vis.net.PNVisNet.PNVisNetPackage;
import petri.vis.net.PNVisNet.Transition;
/**
 * @generated NOT
 * @author haya
 *
 */
public class IncomingIdentitiesDisjoint extends AbstractModelConstraint {

	public IncomingIdentitiesDisjoint() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		// TODO Auto-generated method stub
		EObject object=ctx.getTarget();
		if(object !=null && object instanceof Transition){
			PetriNet net=NetFunctions.getPetriNet(object);
			PetriNetType type=null;
			if(net!=null){
				type=net.getType();
			}
			if(type !=null && type.eClass().equals(PNVisNetPackage.eINSTANCE.getPNVis()) ){
			Set<Integer> set=new HashSet<Integer>();
			FlatAccess flat=FlatAccess.getFlatAccess(net);
			for(org.pnml.tools.epnk.pnmlcoremodel.Arc arc:flat.getIn((Transition)object)){
				if(arc instanceof Arc){
					IdentityAttribute identity =((Arc) arc).getIdentity();
					if(identity!=null){
						if(set.contains(identity.getText())){
							return ctx.createFailureStatus(new java.lang.Object[]{object});		
						}
						else{
							set.add(identity.getText());
						}
						
					}
					
				}
			}
				
			}
			
		}
		return ctx.createSuccessStatus();
	}

}
