/**
 */
package petri.vis.net.PNVisNet.impl;

import animation.petri.Animations.AnimationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

import petri.vis.net.PNVisNet.AnimationLabel;
import petri.vis.net.PNVisNet.Arc;
import petri.vis.net.PNVisNet.IdentityAttribute;
import petri.vis.net.PNVisNet.MarkingAttribute;
import petri.vis.net.PNVisNet.PNVis;
import petri.vis.net.PNVisNet.PNVisNetFactory;
import petri.vis.net.PNVisNet.PNVisNetPackage;
import petri.vis.net.PNVisNet.Place;
import petri.vis.net.PNVisNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PNVisNetPackageImpl extends EPackageImpl implements PNVisNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pnVisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PNVisNetPackageImpl() {
		super(eNS_URI, PNVisNetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PNVisNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PNVisNetPackage init() {
		if (isInited) return (PNVisNetPackage)EPackage.Registry.INSTANCE.getEPackage(PNVisNetPackage.eNS_URI);

		// Obtain or create and register package
		PNVisNetPackageImpl thePNVisNetPackage = (PNVisNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PNVisNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PNVisNetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnimationsPackage.eINSTANCE.eClass();
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePNVisNetPackage.createPackageContents();

		// Initialize created meta-data
		thePNVisNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePNVisNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PNVisNetPackage.eNS_URI, thePNVisNetPackage);
		return thePNVisNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNVis() {
		return pnVisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Identity() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Marking() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Animation() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityAttribute() {
		return identityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityAttribute_Text() {
		return (EAttribute)identityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkingAttribute() {
		return markingAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkingAttribute_Text() {
		return (EAttribute)markingAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationLabel() {
		return animationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationLabel_Structure() {
		return (EReference)animationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNVisNetFactory getPNVisNetFactory() {
		return (PNVisNetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pnVisEClass = createEClass(PN_VIS);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__IDENTITY);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__MARKING);
		createEReference(placeEClass, PLACE__ANIMATION);

		identityAttributeEClass = createEClass(IDENTITY_ATTRIBUTE);
		createEAttribute(identityAttributeEClass, IDENTITY_ATTRIBUTE__TEXT);

		markingAttributeEClass = createEClass(MARKING_ATTRIBUTE);
		createEAttribute(markingAttributeEClass, MARKING_ATTRIBUTE__TEXT);

		animationLabelEClass = createEClass(ANIMATION_LABEL);
		createEReference(animationLabelEClass, ANIMATION_LABEL__STRUCTURE);

		transitionEClass = createEClass(TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);
		AnimationsPackage theAnimationsPackage = (AnimationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnimationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pnVisEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		identityAttributeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		markingAttributeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		animationLabelEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(pnVisEClass, PNVis.class, "PNVis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Identity(), this.getIdentityAttribute(), null, "identity", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Marking(), this.getMarkingAttribute(), null, "marking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Animation(), this.getAnimationLabel(), null, "animation", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityAttributeEClass, IdentityAttribute.class, "IdentityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentityAttribute_Text(), ecorePackage.getEInt(), "text", null, 0, 1, IdentityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingAttributeEClass, MarkingAttribute.class, "MarkingAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkingAttribute_Text(), ecorePackage.getEBoolean(), "text", "false", 1, 1, MarkingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationLabelEClass, AnimationLabel.class, "AnimationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnimationLabel_Structure(), theAnimationsPackage.getAnimation(), null, "structure", null, 1, 1, AnimationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PNVisNetPackageImpl
