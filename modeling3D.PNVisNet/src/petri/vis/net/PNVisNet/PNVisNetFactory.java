/**
 */
package petri.vis.net.PNVisNet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petri.vis.net.PNVisNet.PNVisNetPackage
 * @generated
 */
public interface PNVisNetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PNVisNetFactory eINSTANCE = petri.vis.net.PNVisNet.impl.PNVisNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PN Vis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PN Vis</em>'.
	 * @generated
	 */
	PNVis createPNVis();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Identity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Attribute</em>'.
	 * @generated
	 */
	IdentityAttribute createIdentityAttribute();

	/**
	 * Returns a new object of class '<em>Marking Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking Attribute</em>'.
	 * @generated
	 */
	MarkingAttribute createMarkingAttribute();

	/**
	 * Returns a new object of class '<em>Animation Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation Label</em>'.
	 * @generated
	 */
	AnimationLabel createAnimationLabel();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PNVisNetPackage getPNVisNetPackage();

} //PNVisNetFactory
