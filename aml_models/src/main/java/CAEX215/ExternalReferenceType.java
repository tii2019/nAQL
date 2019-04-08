/**
 */
package CAEX215;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.ExternalReferenceType#getAlias <em>Alias</em>}</li>
 *   <li>{@link CAEX215.ExternalReferenceType#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see CAEX215.CAEX215Package#getExternalReferenceType()
 * @model extendedMetaData="name='ExternalReference_._type' kind='elementOnly'"
 * @generated
 */
public interface ExternalReferenceType extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the alias name of an external CAEX file to enable referencing elements of the external CAEX file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see CAEX215.CAEX215Package#getExternalReferenceType_Alias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link CAEX215.ExternalReferenceType#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the path of the external CAEX file. Absolute and relative paths are allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see CAEX215.CAEX215Package#getExternalReferenceType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link CAEX215.ExternalReferenceType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ExternalReferenceType
