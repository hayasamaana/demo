/**
 */
package petri.vis.net.PNVisNet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petri.vis.net.PNVisNet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PNVisNetFactoryImpl extends EFactoryImpl implements PNVisNetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PNVisNetFactory init() {
		try {
			PNVisNetFactory thePNVisNetFactory = (PNVisNetFactory)EPackage.Registry.INSTANCE.getEFactory(PNVisNetPackage.eNS_URI);
			if (thePNVisNetFactory != null) {
				return thePNVisNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PNVisNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNVisNetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PNVisNetPackage.PN_VIS: return createPNVis();
			case PNVisNetPackage.ARC: return createArc();
			case PNVisNetPackage.PLACE: return createPlace();
			case PNVisNetPackage.IDENTITY_ATTRIBUTE: return createIdentityAttribute();
			case PNVisNetPackage.MARKING_ATTRIBUTE: return createMarkingAttribute();
			case PNVisNetPackage.ANIMATION_LABEL: return createAnimationLabel();
			case PNVisNetPackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNVis createPNVis() {
		PNVisImpl pnVis = new PNVisImpl();
		return pnVis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAttribute createIdentityAttribute() {
		IdentityAttributeImpl identityAttribute = new IdentityAttributeImpl();
		return identityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkingAttribute createMarkingAttribute() {
		MarkingAttributeImpl markingAttribute = new MarkingAttributeImpl();
		return markingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLabel createAnimationLabel() {
		AnimationLabelImpl animationLabel = new AnimationLabelImpl();
		return animationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNVisNetPackage getPNVisNetPackage() {
		return (PNVisNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PNVisNetPackage getPackage() {
		return PNVisNetPackage.eINSTANCE;
	}

} //PNVisNetFactoryImpl
