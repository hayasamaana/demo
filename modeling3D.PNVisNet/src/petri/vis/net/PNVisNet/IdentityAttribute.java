/**
 */
package petri.vis.net.PNVisNet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.IdentityAttribute#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getIdentityAttribute()
 * @model
 * @generated
 */
public interface IdentityAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(int)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getIdentityAttribute_Text()
	 * @model
	 * @generated
	 */
	int getText();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.IdentityAttribute#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(int value);

} // IdentityAttribute
