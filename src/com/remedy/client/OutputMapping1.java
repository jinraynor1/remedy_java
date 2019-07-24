
package com.remedy.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OutputMapping1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OutputMapping1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Incident_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputMapping1", propOrder = {
    "incidentNumber"
})
public class OutputMapping1 {

    @XmlElement(name = "Incident_Number")
    protected String incidentNumber;

    /**
     * Obtiene el valor de la propiedad incidentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentNumber() {
        return incidentNumber;
    }

    /**
     * Define el valor de la propiedad incidentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentNumber(String value) {
        this.incidentNumber = value;
    }

}
