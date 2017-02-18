/**
 */
package petri.vis.net.PNVisNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.Arc#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(IdentityAttribute)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getArc_Identity()
	 * @model containment="true"
	 * @generated
	 */
	IdentityAttribute getIdentity();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.Arc#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(IdentityAttribute value);

} // Arc
