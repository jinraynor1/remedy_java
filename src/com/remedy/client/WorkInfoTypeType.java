
package com.remedy.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Work_Info_TypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Work_Info_TypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="----- Customer Inbound -----"/>
 *     &lt;enumeration value="Customer Communication"/>
 *     &lt;enumeration value="Customer Follow-up"/>
 *     &lt;enumeration value="Customer Status Update"/>
 *     &lt;enumeration value="----- Customer Outbound -----"/>
 *     &lt;enumeration value="Closure Follow Up"/>
 *     &lt;enumeration value="Detail Clarification"/>
 *     &lt;enumeration value="General Information"/>
 *     &lt;enumeration value="Resolution Communications"/>
 *     &lt;enumeration value="Satisfaction Survey"/>
 *     &lt;enumeration value="Status Update"/>
 *     &lt;enumeration value="----- General -----"/>
 *     &lt;enumeration value="Incident Task / Action"/>
 *     &lt;enumeration value="Problem Script"/>
 *     &lt;enumeration value="Working Log"/>
 *     &lt;enumeration value="Email System"/>
 *     &lt;enumeration value="Paging System"/>
 *     &lt;enumeration value="BMC Impact Manager Update"/>
 *     &lt;enumeration value="Chat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Work_Info_TypeType")
@XmlEnum
public enum WorkInfoTypeType {

    @XmlEnumValue("----- Customer Inbound -----")
    CUSTOMER_INBOUND("----- Customer Inbound -----"),
    @XmlEnumValue("Customer Communication")
    CUSTOMER_COMMUNICATION("Customer Communication"),
    @XmlEnumValue("Customer Follow-up")
    CUSTOMER_FOLLOW_UP("Customer Follow-up"),
    @XmlEnumValue("Customer Status Update")
    CUSTOMER_STATUS_UPDATE("Customer Status Update"),
    @XmlEnumValue("----- Customer Outbound -----")
    CUSTOMER_OUTBOUND("----- Customer Outbound -----"),
    @XmlEnumValue("Closure Follow Up")
    CLOSURE_FOLLOW_UP("Closure Follow Up"),
    @XmlEnumValue("Detail Clarification")
    DETAIL_CLARIFICATION("Detail Clarification"),
    @XmlEnumValue("General Information")
    GENERAL_INFORMATION("General Information"),
    @XmlEnumValue("Resolution Communications")
    RESOLUTION_COMMUNICATIONS("Resolution Communications"),
    @XmlEnumValue("Satisfaction Survey")
    SATISFACTION_SURVEY("Satisfaction Survey"),
    @XmlEnumValue("Status Update")
    STATUS_UPDATE("Status Update"),
    @XmlEnumValue("----- General -----")
    GENERAL("----- General -----"),
    @XmlEnumValue("Incident Task / Action")
    INCIDENT_TASK_ACTION("Incident Task / Action"),
    @XmlEnumValue("Problem Script")
    PROBLEM_SCRIPT("Problem Script"),
    @XmlEnumValue("Working Log")
    WORKING_LOG("Working Log"),
    @XmlEnumValue("Email System")
    EMAIL_SYSTEM("Email System"),
    @XmlEnumValue("Paging System")
    PAGING_SYSTEM("Paging System"),
    @XmlEnumValue("BMC Impact Manager Update")
    BMC_IMPACT_MANAGER_UPDATE("BMC Impact Manager Update"),
    @XmlEnumValue("Chat")
    CHAT("Chat");
    private final String value;

    WorkInfoTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkInfoTypeType fromValue(String v) {
        for (WorkInfoTypeType c: WorkInfoTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
