/**
 */
package petri.vis.net.PNVisNet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.MarkingAttribute#isText <em>Text</em>}</li>
 * </ul>
 *
 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getMarkingAttribute()
 * @model
 * @generated
 */
public interface MarkingAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(boolean)
	 * @see petri.vis.net.PNVisNet.PNVisNetPackage#getMarkingAttribute_Text()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isText();

	/**
	 * Sets the value of the '{@link petri.vis.net.PNVisNet.MarkingAttribute#isText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isText()
	 * @generated
	 */
	void setText(boolean value);

} // MarkingAttribute
