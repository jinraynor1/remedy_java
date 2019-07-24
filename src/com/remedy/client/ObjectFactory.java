
package com.remedy.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.remedy.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticationInfo_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "AuthenticationInfo");
    private final static QName _HelpDeskSubmitServiceResponse_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "HelpDesk_Submit_ServiceResponse");
    private final static QName _HelpDeskSubmitService_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "HelpDesk_Submit_Service");
    private final static QName _InputMapping1WorkInfoLocked_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Work_Info_Locked");
    private final static QName _InputMapping1ReportedSource_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Reported_Source");
    private final static QName _InputMapping1CreateRequest_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Create_Request");
    private final static QName _InputMapping1Urgency_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Urgency");
    private final static QName _InputMapping1WorkInfoSource_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Work_Info_Source");
    private final static QName _InputMapping1WorkInfoViewAccess_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Work_Info_View_Access");
    private final static QName _InputMapping1ServiceType_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Service_Type");
    private final static QName _InputMapping1Impact_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Impact");
    private final static QName _InputMapping1StatusReason_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Status_Reason");
    private final static QName _InputMapping1WorkInfoType_QNAME = new QName("urn:HPD_IncidentInterface_Create_WS1", "Work_Info_Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.remedy.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputMapping1 }
     * 
     */
    public InputMapping1 createInputMapping1() {
        return new InputMapping1();
    }

    /**
     * Create an instance of {@link OutputMapping1 }
     * 
     */
    public OutputMapping1 createOutputMapping1() {
        return new OutputMapping1();
    }

    /**
     * Create an instance of {@link AuthenticationInfo }
     * 
     */
    public AuthenticationInfo createAuthenticationInfo() {
        return new AuthenticationInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "AuthenticationInfo")
    public JAXBElement<AuthenticationInfo> createAuthenticationInfo(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_AuthenticationInfo_QNAME, AuthenticationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputMapping1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "HelpDesk_Submit_ServiceResponse")
    public JAXBElement<OutputMapping1> createHelpDeskSubmitServiceResponse(OutputMapping1 value) {
        return new JAXBElement<OutputMapping1>(_HelpDeskSubmitServiceResponse_QNAME, OutputMapping1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputMapping1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "HelpDesk_Submit_Service")
    public JAXBElement<InputMapping1> createHelpDeskSubmitService(InputMapping1 value) {
        return new JAXBElement<InputMapping1>(_HelpDeskSubmitService_QNAME, InputMapping1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Work_Info_Locked", scope = InputMapping1 .class)
    public JAXBElement<CreateRequestType> createInputMapping1WorkInfoLocked(CreateRequestType value) {
        return new JAXBElement<CreateRequestType>(_InputMapping1WorkInfoLocked_QNAME, CreateRequestType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportedSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Reported_Source", scope = InputMapping1 .class)
    public JAXBElement<ReportedSourceType> createInputMapping1ReportedSource(ReportedSourceType value) {
        return new JAXBElement<ReportedSourceType>(_InputMapping1ReportedSource_QNAME, ReportedSourceType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Create_Request", scope = InputMapping1 .class)
    public JAXBElement<CreateRequestType> createInputMapping1CreateRequest(CreateRequestType value) {
        return new JAXBElement<CreateRequestType>(_InputMapping1CreateRequest_QNAME, CreateRequestType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Urgency", scope = InputMapping1 .class)
    public JAXBElement<String> createInputMapping1Urgency(String value) {
        return new JAXBElement<String>(_InputMapping1Urgency_QNAME, String.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkInfoSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Work_Info_Source", scope = InputMapping1 .class)
    public JAXBElement<WorkInfoSourceType> createInputMapping1WorkInfoSource(WorkInfoSourceType value) {
        return new JAXBElement<WorkInfoSourceType>(_InputMapping1WorkInfoSource_QNAME, WorkInfoSourceType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkInfoViewAccessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Work_Info_View_Access", scope = InputMapping1 .class)
    public JAXBElement<WorkInfoViewAccessType> createInputMapping1WorkInfoViewAccess(WorkInfoViewAccessType value) {
        return new JAXBElement<WorkInfoViewAccessType>(_InputMapping1WorkInfoViewAccess_QNAME, WorkInfoViewAccessType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Service_Type", scope = InputMapping1 .class)
    public JAXBElement<ServiceTypeType> createInputMapping1ServiceType(ServiceTypeType value) {
        return new JAXBElement<ServiceTypeType>(_InputMapping1ServiceType_QNAME, ServiceTypeType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Impact", scope = InputMapping1 .class)
    public JAXBElement<String> createInputMapping1Impact(String value) {
        return new JAXBElement<String>(_InputMapping1Impact_QNAME, String.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Status_Reason", scope = InputMapping1 .class)
    public JAXBElement<StatusReasonType> createInputMapping1StatusReason(StatusReasonType value) {
        return new JAXBElement<StatusReasonType>(_InputMapping1StatusReason_QNAME, StatusReasonType.class, InputMapping1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkInfoTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:HPD_IncidentInterface_Create_WS1", name = "Work_Info_Type", scope = InputMapping1 .class)
    public JAXBElement<WorkInfoTypeType> createInputMapping1WorkInfoType(WorkInfoTypeType value) {
        return new JAXBElement<WorkInfoTypeType>(_InputMapping1WorkInfoType_QNAME, WorkInfoTypeType.class, InputMapping1 .class, value);
    }

}
