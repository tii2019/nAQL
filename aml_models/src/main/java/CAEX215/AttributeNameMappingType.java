/**
 */
package CAEX215;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.AttributeNameMappingType#getRoleAttributeName <em>Role Attribute Name</em>}</li>
 *   <li>{@link CAEX215.AttributeNameMappingType#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}</li>
 * </ul>
 *
 * @see CAEX215.CAEX215Package#getAttributeNameMappingType()
 * @model extendedMetaData="name='AttributeNameMapping_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeNameMappingType extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #setRoleAttributeName(String)
	 * @see CAEX215.CAEX215Package#getAttributeNameMappingType_RoleAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='RoleAttributeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRoleAttributeName();

	/**
	 * Sets the value of the '{@link CAEX215.AttributeNameMappingType#getRoleAttributeName <em>Role Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #getRoleAttributeName()
	 * @generated
	 */
	void setRoleAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #setSystemUnitAttributeName(String)
	 * @see CAEX215.CAEX215Package#getAttributeNameMappingType_SystemUnitAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SystemUnitAttributeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemUnitAttributeName();

	/**
	 * Sets the value of the '{@link CAEX215.AttributeNameMappingType#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #getSystemUnitAttributeName()
	 * @generated
	 */
	void setSystemUnitAttributeName(String value);

} // AttributeNameMappingType
