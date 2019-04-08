/**
 */
package CAEX215;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX215.NominalScaledTypeType#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @see CAEX215.CAEX215Package#getNominalScaledTypeType()
 * @model extendedMetaData="name='NominalScaledType_._type' kind='elementOnly'"
 * @generated
 */
public interface NominalScaledTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.xml.type.AnyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. It may be defined multiple times in order to define a discrete value range of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' containment reference list.
	 * @see CAEX215.CAEX215Package#getNominalScaledTypeType_RequiredValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnyType> getRequiredValue();

} // NominalScaledTypeType
