/**
 * Copyright (c) 2013 MEDEVIT <office@medevit.at>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     MEDEVIT <office@medevit.at> - initial API and implementation
 */
package ch.elexis.core.model;

import ch.elexis.core.types.LabItemTyp;
import ch.rgw.tools.TimeTool;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILab Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.elexis.core.model.ILabResult#getRefMale <em>Ref Male</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getRefFemale <em>Ref Female</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getUnit <em>Unit</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getAnalyseTime <em>Analyse Time</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getObservationTime <em>Observation Time</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getTransmissionTime <em>Transmission Time</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getResult <em>Result</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getFlags <em>Flags</em>}</li>
 *   <li>{@link ch.elexis.core.model.ILabResult#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see ch.elexis.core.model.ModelPackage#getILabResult()
 * @model abstract="true"
 * @generated
 */
public interface ILabResult extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Ref Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Male</em>' attribute.
	 * @see #setRefMale(String)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_RefMale()
	 * @model
	 * @generated
	 */
	String getRefMale();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getRefMale <em>Ref Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Male</em>' attribute.
	 * @see #getRefMale()
	 * @generated
	 */
	void setRefMale(String value);

	/**
	 * Returns the value of the '<em><b>Ref Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Female</em>' attribute.
	 * @see #setRefFemale(String)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_RefFemale()
	 * @model
	 * @generated
	 */
	String getRefFemale();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getRefFemale <em>Ref Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Female</em>' attribute.
	 * @see #getRefFemale()
	 * @generated
	 */
	void setRefFemale(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Analyse Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyse Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyse Time</em>' attribute.
	 * @see #setAnalyseTime(TimeTool)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_AnalyseTime()
	 * @model dataType="ch.elexis.core.types.TimeTool"
	 * @generated
	 */
	TimeTool getAnalyseTime();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getAnalyseTime <em>Analyse Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyse Time</em>' attribute.
	 * @see #getAnalyseTime()
	 * @generated
	 */
	void setAnalyseTime(TimeTool value);

	/**
	 * Returns the value of the '<em><b>Observation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Time</em>' attribute.
	 * @see #setObservationTime(TimeTool)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_ObservationTime()
	 * @model dataType="ch.elexis.core.types.TimeTool"
	 * @generated
	 */
	TimeTool getObservationTime();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getObservationTime <em>Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Time</em>' attribute.
	 * @see #getObservationTime()
	 * @generated
	 */
	void setObservationTime(TimeTool value);

	/**
	 * Returns the value of the '<em><b>Transmission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Time</em>' attribute.
	 * @see #setTransmissionTime(TimeTool)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_TransmissionTime()
	 * @model dataType="ch.elexis.core.types.TimeTool"
	 * @generated
	 */
	TimeTool getTransmissionTime();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getTransmissionTime <em>Transmission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Time</em>' attribute.
	 * @see #getTransmissionTime()
	 * @generated
	 */
	void setTransmissionTime(TimeTool value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_Flags()
	 * @model
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ch.elexis.core.model.ModelPackage#getILabResult_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ch.elexis.core.model.ILabResult#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // ILabResult
