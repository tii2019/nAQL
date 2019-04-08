/**
 */
package CAEX215;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Basic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CAEX basis object that comprises a basic set of attributes and header information which exist for all CAEX elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.CAEXBasicObject#getDescription <em>Description</em>}</li>
 *   <li>{@link CAEX215.CAEXBasicObject#getVersion <em>Version</em>}</li>
 *   <li>{@link CAEX215.CAEXBasicObject#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link CAEX215.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link CAEX215.CAEXBasicObject#getChangeMode <em>Change Mode</em>}</li>
 *   <li>{@link CAEX215.CAEXBasicObject#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @see CAEX215.CAEX215Package#getCAEXBasicObject()
 * @model extendedMetaData="name='CAEXBasicObject' kind='elementOnly'"
 * @generated
 */
public interface CAEXBasicObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual description for CAEX objects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link CAEX215.CAEXBasicObject#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organizational information about the state of the version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(VersionType)
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link CAEX215.CAEXBasicObject#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organizational information about copyright.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightType)
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightType getCopyright();

	/**
	 * Sets the value of the '{@link CAEX215.CAEXBasicObject#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(CopyrightType value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.xml.type.AnyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional auxiliary field that may contain any additional information about a CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference list.
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_AdditionalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnyType> getAdditionalInformation();

	/**
	 * Returns the value of the '<em><b>Change Mode</b></em>' attribute.
	 * The default value is <code>"state"</code>.
	 * The literals are from the enumeration {@link CAEX215.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionally describes the change state of an CAEX object. If used, the ChangeMode shall have the following value range: state, create, delete and change. This information should be used for further change management applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Mode</em>' attribute.
	 * @see CAEX215.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_ChangeMode()
	 * @model default="state" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ChangeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link CAEX215.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see CAEX215.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

	/**
	 * Unsets the value of the '{@link CAEX215.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	void unsetChangeMode();

	/**
	 * Returns whether the value of the '{@link CAEX215.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Change Mode</em>' attribute is set.
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	boolean isSetChangeMode();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX215.RevisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference list.
	 * @see CAEX215.CAEX215Package#getCAEXBasicObject_Revision()
	 * @model containment="true"
	 * @generated
	 */
	EList<RevisionType> getRevision();

} // CAEXBasicObject
