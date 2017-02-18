/**
 */
package petri.vis.net.PNVisNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.Place#getMarking <em>Marking</em>}</li>
 *   <li>{@link petri.vis.net.PNVisNet.Place#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(MarkingAttribute)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getPlace_Marking()
	 * @model containment="true"
	 * @generated
	 */
	MarkingAttribute getMarking();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.Place#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(MarkingAttribute value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference.
	 * @see #setAnimation(AnimationLabel)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getPlace_Animation()
	 * @model containment="true"
	 * @generated
	 */
	AnimationLabel getAnimation();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.Place#getAnimation <em>Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' containment reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(AnimationLabel value);

} // Place
