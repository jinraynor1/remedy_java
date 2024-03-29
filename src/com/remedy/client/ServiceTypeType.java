
package com.remedy.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Service_TypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Service_TypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User Service Restoration"/>
 *     &lt;enumeration value="User Service Request"/>
 *     &lt;enumeration value="Infrastructure Restoration"/>
 *     &lt;enumeration value="Infrastructure Event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Service_TypeType")
@XmlEnum
public enum ServiceTypeType {

    @XmlEnumValue("User Service Restoration")
    USER_SERVICE_RESTORATION("User Service Restoration"),
    @XmlEnumValue("User Service Request")
    USER_SERVICE_REQUEST("User Service Request"),
    @XmlEnumValue("Infrastructure Restoration")
    INFRASTRUCTURE_RESTORATION("Infrastructure Restoration"),
    @XmlEnumValue("Infrastructure Event")
    INFRASTRUCTURE_EVENT("Infrastructure Event");
    private final String value;

    ServiceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTypeType fromValue(String v) {
        for (ServiceTypeType c: ServiceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
