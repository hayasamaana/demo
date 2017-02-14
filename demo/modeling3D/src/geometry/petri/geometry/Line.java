/**
 */
package geometry.petri.geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geometry.petri.geometry.Line#getStart <em>Start</em>}</li>
 *   <li>{@link geometry.petri.geometry.Line#getEnd <em>End</em>}</li>
 *   <li>{@link geometry.petri.geometry.Line#getIntermediate <em>Intermediate</em>}</li>
 *   <li>{@link geometry.petri.geometry.Line#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see geometry.petri.geometry.GeometryPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GeoObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.petri.geometry.Point#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Point)
	 * @see geometry.petri.geometry.GeometryPackage#getLine_Start()
	 * @see geometry.petri.geometry.Point#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link geometry.petri.geometry.Line#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.petri.geometry.Point#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Point)
	 * @see geometry.petri.geometry.GeometryPackage#getLine_End()
	 * @see geometry.petri.geometry.Point#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link geometry.petri.geometry.Line#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

	/**
	 * Returns the value of the '<em><b>Intermediate</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.petri.geometry.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate</em>' containment reference list.
	 * @see geometry.petri.geometry.GeometryPackage#getLine_Intermediate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getIntermediate();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link geometry.petri.geometry.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see geometry.petri.geometry.LineType
	 * @see #setType(LineType)
	 * @see geometry.petri.geometry.GeometryPackage#getLine_Type()
	 * @model required="true"
	 * @generated
	 */
	LineType getType();

	/**
	 * Sets the value of the '{@link geometry.petri.geometry.Line#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see geometry.petri.geometry.LineType
	 * @see #getType()
	 * @generated
	 */
	void setType(LineType value);

} // Line
