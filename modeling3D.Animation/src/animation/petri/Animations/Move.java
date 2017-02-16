/**
 */
package animation.petri.Animations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link animation.petri.Animations.Move#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see animation.petri.Animations.AnimationsPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Animation {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see animation.petri.Animations.AnimationsPackage#getMove_Speed()
	 * @model default="10" required="true"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link animation.petri.Animations.Move#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

} // Move
