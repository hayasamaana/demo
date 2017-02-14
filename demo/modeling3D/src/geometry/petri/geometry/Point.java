/**
 */
package geometry.petri.geometry;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geometry.petri.geometry.Point#getIn <em>In</em>}</li>
 *   <li>{@link geometry.petri.geometry.Point#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see geometry.petri.geometry.GeometryPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Position, GeoObject {

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link geometry.petri.geometry.Line}.
	 * It is bidirectional and its opposite is '{@link geometry.petri.geometry.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see geometry.petri.geometry.GeometryPackage#getPoint_In()
	 * @see geometry.petri.geometry.Line#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	EList<Line> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link geometry.petri.geometry.Line}.
	 * It is bidirectional and its opposite is '{@link geometry.petri.geometry.Line#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see geometry.petri.geometry.GeometryPackage#getPoint_Out()
	 * @see geometry.petri.geometry.Line#getStart
	 * @model opposite="start"
	 * @generated
	 */
	EList<Line> getOut();
} // Point
