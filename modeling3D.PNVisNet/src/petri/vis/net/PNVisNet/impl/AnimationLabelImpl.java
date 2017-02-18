/**
 */
package petri.vis.net.PNVisNet.impl;

import animation.petri.Animations.Animation;
import animation.petri.Animations.AnimationsFactory;
import animation.petri.Animations.Sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl;

import petri.vis.net.PNVisNet.AnimationLabel;
import petri.vis.net.PNVisNet.PNVisNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petri.vis.net.PNVisNet.impl.AnimationLabelImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimationLabelImpl extends StructuredLabelImpl implements AnimationLabel {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Animation structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationLabelImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EObject parse(String input) {
		// TODO Auto-generated method stub
		String[]animations=input.split(";?\\s+"); // split according to ; and multiple spaces  ? left right handside of substring
		if(animations!=null){
			if(animations.length==0){	return null;}
			else if(animations.length==1){
				return parseAnimation(animations[0]);	
			}
			else{
				Sequence sequence=AnimationsFactory.eINSTANCE.createSequence();
				for(String text:animations){
					Animation animation=parseAnimation(text);
					if(animation!=null){
						sequence.getAnimations().add(animation);
						
					}
					else {
						return null;
					}	
				}
				return sequence;
			}	
		}
		return null; 
	}
	/**
	 * @generated NOT
	 * @param input
	 * @return
	 */
	private Animation parseAnimation(String input) {
		// TODO Auto-generated method stub
		if("move".equals(input)){
			return AnimationsFactory.eINSTANCE.createMove();
			
		}
		else if("appear".equals(input)){
			return AnimationsFactory.eINSTANCE.createAppear();
		}
		else if("trigger".equals(input)){
			return AnimationsFactory.eINSTANCE.createTrigger();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PNVisNetPackage.Literals.ANIMATION_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Animation newStructure, NotificationChain msgs) {
		Animation oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PNVisNetPackage.ANIMATION_LABEL__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Animation newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PNVisNetPackage.ANIMATION_LABEL__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PNVisNetPackage.ANIMATION_LABEL__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PNVisNetPackage.ANIMATION_LABEL__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PNVisNetPackage.ANIMATION_LABEL__STRUCTURE:
				return basicSetStructure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PNVisNetPackage.ANIMATION_LABEL__STRUCTURE:
				return getStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PNVisNetPackage.ANIMATION_LABEL__STRUCTURE:
				setStructure((Animation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PNVisNetPackage.ANIMATION_LABEL__STRUCTURE:
				setStructure((Animation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PNVisNetPackage.ANIMATION_LABEL__STRUCTURE:
				return structure != null;
		}
		return super.eIsSet(featureID);
	}

} //AnimationLabelImpl
