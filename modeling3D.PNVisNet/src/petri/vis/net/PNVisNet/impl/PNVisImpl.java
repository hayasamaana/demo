/**
 */
package petri.vis.net.PNVisNet.impl;

import java.io.Reader;
import java.io.StringReader;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.IGrammarAccess.IParserRuleAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import org.xtext.example.mydsl.parser.antlr.MyDslParser;
import org.antlr.v4.runtime.CharStream;
import com.google.inject.Injector;

import animation.petri.Animations.Animation;
import petri.vis.net.PNVisNet.PNVis;
import petri.vis.net.PNVisNet.PNVisNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PN Vis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PNVisImpl extends PetriNetTypeImpl implements PNVis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PNVisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PNVisNetPackage.Literals.PN_VIS;
	}
/**
 * @generated NOT
 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "http://pnvis.net";
	}
	/**
	 * @generated NOT
	 */
	private MyDslParser parser=null;

	/**
	 * @generated NOT
	 */
	 public Animation parseAnimationLabel(String text){
		 if(parser==null){
			 Injector injector=new MyDslStandaloneSetupGenerated().createInjector();
			 parser=injector.getInstance(MyDslParser.class);	 
		 }
		ParserRule rule= parser.getGrammarAccess().getAnimationRule();
		IParseResult result=parser.parse(rule,new Reader(text));
		Iterable<INode> errors=result.getSyntaxErrors();
		if(!errors.iterator.hasNext()){
			EObject object=result.getRootASTElement();
			if(object instanceof Animation){
				return (Animation)object;
			}
			
		}
		
		 return null;
		 
	 }
} //PNVisImpl
