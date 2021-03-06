/**
 */
package petri.vis.net.PNVisNet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import petri.vis.net.PNVisNet.PNVisNetFactory;
import petri.vis.net.PNVisNet.Place;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaceTest extends TestCase {

	/**
	 * The fixture for this Place test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlaceTest.class);
	}

	/**
	 * Constructs a new Place test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Place test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Place fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Place test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PNVisNetFactory.eINSTANCE.createPlace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PlaceTest
