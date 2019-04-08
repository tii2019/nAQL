/**
 */
package CAEX215.impl;

import CAEX215.CAEX215Package;
import CAEX215.NominalScaledTypeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nominal Scaled Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.impl.NominalScaledTypeTypeImpl#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NominalScaledTypeTypeImpl extends MinimalEObjectImpl.Container implements NominalScaledTypeType {
	/**
	 * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyType> requiredValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NominalScaledTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEX215Package.Literals.NOMINAL_SCALED_TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyType> getRequiredValue() {
		if (requiredValue == null) {
			requiredValue = new EObjectContainmentEList<AnyType>(AnyType.class, this, CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE);
		}
		return requiredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE:
				return ((InternalEList<?>)getRequiredValue()).basicRemove(otherEnd, msgs);
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
			case CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE:
				return getRequiredValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE:
				getRequiredValue().clear();
				getRequiredValue().addAll((Collection<? extends AnyType>)newValue);
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
			case CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE:
				getRequiredValue().clear();
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
			case CAEX215Package.NOMINAL_SCALED_TYPE_TYPE__REQUIRED_VALUE:
				return requiredValue != null && !requiredValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NominalScaledTypeTypeImpl
