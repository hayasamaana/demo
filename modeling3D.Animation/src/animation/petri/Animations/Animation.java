/**
 */
package animation.petri.Animations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link animation.petri.Animations.Animation#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @see animation.petri.Animations.AnimationsPackage#getAnimation()
 * @model abstract="true"
 * @generated
 */
public interface Animation extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see animation.petri.Animations.AnimationsPackage#getAnimation_Geometry()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link animation.petri.Animations.Animation#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

} // Animation
