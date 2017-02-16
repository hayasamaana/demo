/**
 */
package animation.petri.Animations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link animation.petri.Animations.Sequence#getAnimations <em>Animations</em>}</li>
 * </ul>
 *
 * @see animation.petri.Animations.AnimationsPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Animation {
	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference list.
	 * The list contents are of type {@link animation.petri.Animations.Animation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference list.
	 * @see animation.petri.Animations.AnimationsPackage#getSequence_Animations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animation> getAnimations();

} // Sequence
