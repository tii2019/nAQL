/**
 */
package CAEX215.impl;

import CAEX215.CAEX215Package;
import CAEX215.RoleClassLibType;
import CAEX215.RoleFamilyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Class Lib Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.impl.RoleClassLibTypeImpl#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleClassLibTypeImpl extends CAEXObjectImpl implements RoleClassLibType {
	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFamilyType> roleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleClassLibTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEX215Package.Literals.ROLE_CLASS_LIB_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleFamilyType> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleFamilyType>(RoleFamilyType.class, this, CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
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
			case CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS:
				return getRoleClass();
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
			case CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleFamilyType>)newValue);
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
			case CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS:
				getRoleClass().clear();
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
			case CAEX215Package.ROLE_CLASS_LIB_TYPE__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	public RoleFamilyType getRoleClassByPath(String refBaseClassPath) {
		RoleFamilyType role = null;
		String[] tokens = refBaseClassPath.split("/");
		String rcl_name = tokens[0];		
		if(this.getName().equalsIgnoreCase(rcl_name)) {
			int i = 1;
			for(RoleFamilyType rf : this.getRoleClass()) {					
				if(rf.getName().equalsIgnoreCase(tokens[i])) {
					RoleFamilyType step = rf;
					i++;
					while(i <= tokens.length-1) {								
						 step = findRC(step, tokens[i]);
						 if(step.getName().equalsIgnoreCase(tokens[tokens.length-1])) {
							 role = step;
							 break;	
						 }																 
						 i++;							 							
					}																
				}
			}
		}
		return role;
	}
	
	private RoleFamilyType findRC(RoleFamilyType root, String rc_name) {
//		System.out.println("looking for " + rc_name + " under " + root.getName());
		for(RoleFamilyType rf : root.getRoleClass()) {
			if(rf.getName().equalsIgnoreCase(rc_name)) {
				return rf;
			}
		}
		return null;
	}

} //RoleClassLibTypeImpl
