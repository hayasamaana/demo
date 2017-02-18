/**
 */
package petri.vis.net.PNVisNet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import petri.vis.net.PNVisNet.PNVis;
import petri.vis.net.PNVisNet.PNVisNetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PN Vis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PNVisTest extends TestCase {

	/**
	 * The fixture for this PN Vis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNVis fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PNVisTest.class);
	}

	/**
	 * Constructs a new PN Vis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNVisTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PN Vis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PNVis fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PN Vis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNVis getFixture() {
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
		setFixture(PNVisNetFactory.eINSTANCE.createPNVis());
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

} //PNVisTest
