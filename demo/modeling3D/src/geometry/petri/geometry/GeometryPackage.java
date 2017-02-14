/**
 */
package geometry.petri.geometry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see geometry.petri.geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geometry.net";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = geometry.petri.geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link geometry.petri.geometry.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.impl.PositionImpl
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link geometry.petri.geometry.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.impl.GeometryImpl
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__LINES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link geometry.petri.geometry.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.impl.PointImpl
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = POSITION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = POSITION__Y;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__IN = POSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__OUT = POSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = POSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link geometry.petri.geometry.impl.GeoObjectImpl <em>Geo Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.impl.GeoObjectImpl
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getGeoObject()
	 * @generated
	 */
	int GEO_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Geo Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link geometry.petri.geometry.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.impl.LineImpl
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = GEO_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__START = GEO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__END = GEO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intermediate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__INTERMEDIATE = GEO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TYPE = GEO_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = GEO_OBJECT_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link geometry.petri.geometry.LineType <em>Line Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry.petri.geometry.LineType
	 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link geometry.petri.geometry.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see geometry.petri.geometry.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link geometry.petri.geometry.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see geometry.petri.geometry.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link geometry.petri.geometry.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see geometry.petri.geometry.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link geometry.petri.geometry.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geometry.petri.geometry.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.petri.geometry.Geometry#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see geometry.petri.geometry.Geometry#getPoints()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Points();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.petri.geometry.Geometry#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see geometry.petri.geometry.Geometry#getLines()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Lines();

	/**
	 * Returns the meta object for the attribute '{@link geometry.petri.geometry.Geometry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see geometry.petri.geometry.Geometry#getName()
	 * @see #getGeometry()
	 * @generated
	 */
	EAttribute getGeometry_Name();

	/**
	 * Returns the meta object for class '{@link geometry.petri.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see geometry.petri.geometry.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the reference list '{@link geometry.petri.geometry.Point#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see geometry.petri.geometry.Point#getIn()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_In();

	/**
	 * Returns the meta object for the reference list '{@link geometry.petri.geometry.Point#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see geometry.petri.geometry.Point#getOut()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Out();

	/**
	 * Returns the meta object for class '{@link geometry.petri.geometry.GeoObject <em>Geo Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Object</em>'.
	 * @see geometry.petri.geometry.GeoObject
	 * @generated
	 */
	EClass getGeoObject();

	/**
	 * Returns the meta object for the attribute '{@link geometry.petri.geometry.GeoObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see geometry.petri.geometry.GeoObject#getId()
	 * @see #getGeoObject()
	 * @generated
	 */
	EAttribute getGeoObject_Id();

	/**
	 * Returns the meta object for class '{@link geometry.petri.geometry.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see geometry.petri.geometry.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link geometry.petri.geometry.Line#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see geometry.petri.geometry.Line#getStart()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Start();

	/**
	 * Returns the meta object for the reference '{@link geometry.petri.geometry.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see geometry.petri.geometry.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry.petri.geometry.Line#getIntermediate <em>Intermediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate</em>'.
	 * @see geometry.petri.geometry.Line#getIntermediate()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Intermediate();

	/**
	 * Returns the meta object for the attribute '{@link geometry.petri.geometry.Line#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see geometry.petri.geometry.Line#getType()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Type();

	/**
	 * Returns the meta object for enum '{@link geometry.petri.geometry.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Type</em>'.
	 * @see geometry.petri.geometry.LineType
	 * @generated
	 */
	EEnum getLineType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.impl.PositionImpl
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.impl.GeometryImpl
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__POINTS = eINSTANCE.getGeometry_Points();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__LINES = eINSTANCE.getGeometry_Lines();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY__NAME = eINSTANCE.getGeometry_Name();

		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.impl.PointImpl
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__IN = eINSTANCE.getPoint_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__OUT = eINSTANCE.getPoint_Out();

		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.impl.GeoObjectImpl <em>Geo Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.impl.GeoObjectImpl
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getGeoObject()
		 * @generated
		 */
		EClass GEO_OBJECT = eINSTANCE.getGeoObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_OBJECT__ID = eINSTANCE.getGeoObject_Id();

		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.impl.LineImpl
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__START = eINSTANCE.getLine_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__END = eINSTANCE.getLine_End();

		/**
		 * The meta object literal for the '<em><b>Intermediate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__INTERMEDIATE = eINSTANCE.getLine_Intermediate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__TYPE = eINSTANCE.getLine_Type();

		/**
		 * The meta object literal for the '{@link geometry.petri.geometry.LineType <em>Line Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry.petri.geometry.LineType
		 * @see geometry.petri.geometry.impl.GeometryPackageImpl#getLineType()
		 * @generated
		 */
		EEnum LINE_TYPE = eINSTANCE.getLineType();

	}

} //GeometryPackage
