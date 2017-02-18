/**
 */
package petri.vis.net.PNVisNet;

import animation.petri.Animations.Animation;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.AnimationLabel#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getAnimationLabel()
 * @model
 * @generated
 */
public interface AnimationLabel extends StructuredLabel {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Animation)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getAnimationLabel_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Animation getStructure();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.AnimationLabel#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Animation value);

} // AnimationLabel
