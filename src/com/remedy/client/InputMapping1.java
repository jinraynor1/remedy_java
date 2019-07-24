
package com.remedy.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para InputMapping1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InputMapping1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assigned_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned_Group_Shift_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned_Support_Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned_Support_Organizationt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categorization_Tier_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categorization_Tier_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categorization_Tier_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CI_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Product_Category_Tier1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Product_Category_Tier2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Product_Category_Tier3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Product_Model_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closure_Product_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Impact" type="{urn:HPD_IncidentInterface_Create_WS1}ImpactType" minOccurs="0"/>
 *         &lt;element name="Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lookup_Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Categorization_Tier_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Categorization_Tier_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Categorization_Tier_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Model_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reported_Source" type="{urn:HPD_IncidentInterface_Create_WS1}Reported_SourceType" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution_Category_Tier_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution_Category_Tier_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution_Category_Tier_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Type" type="{urn:HPD_IncidentInterface_Create_WS1}Service_TypeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:HPD_IncidentInterface_Create_WS1}StatusType"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Create_Request" type="{urn:HPD_IncidentInterface_Create_WS1}Create_RequestType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{urn:HPD_IncidentInterface_Create_WS1}UrgencyType" minOccurs="0"/>
 *         &lt;element name="Work_Info_Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Info_Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Info_Type" type="{urn:HPD_IncidentInterface_Create_WS1}Work_Info_TypeType" minOccurs="0"/>
 *         &lt;element name="Work_Info_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Info_Source" type="{urn:HPD_IncidentInterface_Create_WS1}Work_Info_SourceType" minOccurs="0"/>
 *         &lt;element name="Work_Info_Locked" type="{urn:HPD_IncidentInterface_Create_WS1}Create_RequestType" minOccurs="0"/>
 *         &lt;element name="Work_Info_View_Access" type="{urn:HPD_IncidentInterface_Create_WS1}Work_Info_View_AccessType" minOccurs="0"/>
 *         &lt;element name="Middle_Initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status_Reason" type="{urn:HPD_IncidentInterface_Create_WS1}Status_ReasonType" minOccurs="0"/>
 *         &lt;element name="Direct_Contact_First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Contact_Middle_Initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Contact_Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCI_ReconID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPD_CI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPD_CI_ReconID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPD_CI_FormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkInfoAttachment1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkInfoAttachment1Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="WorkInfoAttachment1OrigSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Login_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Corporate_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Group_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Assignee_Groups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Ticket_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputMapping1", propOrder = {
    "assignedGroup",
    "assignedGroupShiftName",
    "assignedSupportCompany",
    "assignedSupportOrganizationt",
    "assignee",
    "categorizationTier1",
    "categorizationTier2",
    "categorizationTier3",
    "ciName",
    "closureManufacturer",
    "closureProductCategoryTier1",
    "closureProductCategoryTier2",
    "closureProductCategoryTier3",
    "closureProductModelVersion",
    "closureProductName",
    "department",
    "firstName",
    "impact",
    "lastName",
    "lookupKeyword",
    "manufacturer",
    "productCategorizationTier1",
    "productCategorizationTier2",
    "productCategorizationTier3",
    "productModelVersion",
    "productName",
    "reportedSource",
    "resolution",
    "resolutionCategoryTier1",
    "resolutionCategoryTier2",
    "resolutionCategoryTier3",
    "serviceType",
    "status",
    "action",
    "createRequest",
    "summary",
    "notes",
    "urgency",
    "workInfoSummary",
    "workInfoNotes",
    "workInfoType",
    "workInfoDate",
    "workInfoSource",
    "workInfoLocked",
    "workInfoViewAccess",
    "middleInitial",
    "statusReason",
    "directContactFirstName",
    "directContactMiddleInitial",
    "directContactLastName",
    "templateID",
    "serviceCI",
    "serviceCIReconID",
    "hpdci",
    "hpdciReconID",
    "hpdciFormName",
    "workInfoAttachment1Name",
    "workInfoAttachment1Data",
    "workInfoAttachment1OrigSize",
    "loginID",
    "customerCompany",
    "corporateID",
    "vendorName",
    "vendorOrganization",
    "vendorGroup",
    "vendorGroupID",
    "vendorAssigneeGroups",
    "vendorTicketNumber"
})
@XmlRootElement(name = "InputMapping1")
public class InputMapping1 {

    @XmlElement(name = "Assigned_Group")
    protected String assignedGroup;
    @XmlElement(name = "Assigned_Group_Shift_Name")
    protected String assignedGroupShiftName;
    @XmlElement(name = "Assigned_Support_Company")
    protected String assignedSupportCompany;
    @XmlElement(name = "Assigned_Support_Organizationt")
    protected String assignedSupportOrganizationt;
    @XmlElement(name = "Assignee")
    protected String assignee;
    @XmlElement(name = "Categorization_Tier_1")
    protected String categorizationTier1;
    @XmlElement(name = "Categorization_Tier_2")
    protected String categorizationTier2;
    @XmlElement(name = "Categorization_Tier_3")
    protected String categorizationTier3;
    @XmlElement(name = "CI_Name")
    protected String ciName;
    @XmlElement(name = "Closure_Manufacturer")
    protected String closureManufacturer;
    @XmlElement(name = "Closure_Product_Category_Tier1")
    protected String closureProductCategoryTier1;
    @XmlElement(name = "Closure_Product_Category_Tier2")
    protected String closureProductCategoryTier2;
    @XmlElement(name = "Closure_Product_Category_Tier3")
    protected String closureProductCategoryTier3;
    @XmlElement(name = "Closure_Product_Model_Version")
    protected String closureProductModelVersion;
    @XmlElement(name = "Closure_Product_Name")
    protected String closureProductName;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElementRef(name = "Impact", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impact;
    @XmlElement(name = "Last_Name")
    protected String lastName;
    @XmlElement(name = "Lookup_Keyword")
    protected String lookupKeyword;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Product_Categorization_Tier_1")
    protected String productCategorizationTier1;
    @XmlElement(name = "Product_Categorization_Tier_2")
    protected String productCategorizationTier2;
    @XmlElement(name = "Product_Categorization_Tier_3")
    protected String productCategorizationTier3;
    @XmlElement(name = "Product_Model_Version")
    protected String productModelVersion;
    @XmlElement(name = "Product_Name")
    protected String productName;
    @XmlElementRef(name = "Reported_Source", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportedSourceType> reportedSource;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "Resolution_Category_Tier_1")
    protected String resolutionCategoryTier1;
    @XmlElement(name = "Resolution_Category_Tier_2")
    protected String resolutionCategoryTier2;
    @XmlElement(name = "Resolution_Category_Tier_3")
    protected String resolutionCategoryTier3;
    @XmlElementRef(name = "Service_Type", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceTypeType> serviceType;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElementRef(name = "Create_Request", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateRequestType> createRequest;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "Urgency", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urgency;
    @XmlElement(name = "Work_Info_Summary")
    protected String workInfoSummary;
    @XmlElement(name = "Work_Info_Notes")
    protected String workInfoNotes;
    @XmlElementRef(name = "Work_Info_Type", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkInfoTypeType> workInfoType;
    @XmlElement(name = "Work_Info_Date")
    protected String workInfoDate;
    @XmlElementRef(name = "Work_Info_Source", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkInfoSourceType> workInfoSource;
    @XmlElementRef(name = "Work_Info_Locked", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateRequestType> workInfoLocked;
    @XmlElementRef(name = "Work_Info_View_Access", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkInfoViewAccessType> workInfoViewAccess;
    @XmlElement(name = "Middle_Initial")
    protected String middleInitial;
    @XmlElementRef(name = "Status_Reason", namespace = "urn:HPD_IncidentInterface_Create_WS1", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusReasonType> statusReason;
    @XmlElement(name = "Direct_Contact_First_Name")
    protected String directContactFirstName;
    @XmlElement(name = "Direct_Contact_Middle_Initial")
    protected String directContactMiddleInitial;
    @XmlElement(name = "Direct_Contact_Last_Name")
    protected String directContactLastName;
    @XmlElement(name = "TemplateID")
    protected String templateID;
    @XmlElement(name = "ServiceCI")
    protected String serviceCI;
    @XmlElement(name = "ServiceCI_ReconID")
    protected String serviceCIReconID;
    @XmlElement(name = "HPD_CI")
    protected String hpdci;
    @XmlElement(name = "HPD_CI_ReconID")
    protected String hpdciReconID;
    @XmlElement(name = "HPD_CI_FormName")
    protected String hpdciFormName;
    @XmlElement(name = "WorkInfoAttachment1Name")
    protected String workInfoAttachment1Name;
    @XmlElement(name = "WorkInfoAttachment1Data")
    protected byte[] workInfoAttachment1Data;
    @XmlElement(name = "WorkInfoAttachment1OrigSize")
    protected Integer workInfoAttachment1OrigSize;
    @XmlElement(name = "Login_ID")
    protected String loginID;
    @XmlElement(name = "Customer_Company")
    protected String customerCompany;
    @XmlElement(name = "Corporate_ID")
    protected String corporateID;
    @XmlElement(name = "Vendor_Name")
    protected String vendorName;
    @XmlElement(name = "Vendor_Organization")
    protected String vendorOrganization;
    @XmlElement(name = "Vendor_Group")
    protected String vendorGroup;
    @XmlElement(name = "Vendor_Group_ID")
    protected String vendorGroupID;
    @XmlElement(name = "Vendor_Assignee_Groups")
    protected String vendorAssigneeGroups;
    @XmlElement(name = "Vendor_Ticket_number")
    protected String vendorTicketNumber;

    /**
     * Obtiene el valor de la propiedad assignedGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedGroup() {
        return assignedGroup;
    }

    /**
     * Define el valor de la propiedad assignedGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedGroup(String value) {
        this.assignedGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedGroupShiftName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedGroupShiftName() {
        return assignedGroupShiftName;
    }

    /**
     * Define el valor de la propiedad assignedGroupShiftName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedGroupShiftName(String value) {
        this.assignedGroupShiftName = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedSupportCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedSupportCompany() {
        return assignedSupportCompany;
    }

    /**
     * Define el valor de la propiedad assignedSupportCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedSupportCompany(String value) {
        this.assignedSupportCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedSupportOrganizationt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedSupportOrganizationt() {
        return assignedSupportOrganizationt;
    }

    /**
     * Define el valor de la propiedad assignedSupportOrganizationt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedSupportOrganizationt(String value) {
        this.assignedSupportOrganizationt = value;
    }

    /**
     * Obtiene el valor de la propiedad assignee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * Define el valor de la propiedad assignee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignee(String value) {
        this.assignee = value;
    }

    /**
     * Obtiene el valor de la propiedad categorizationTier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorizationTier1() {
        return categorizationTier1;
    }

    /**
     * Define el valor de la propiedad categorizationTier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorizationTier1(String value) {
        this.categorizationTier1 = value;
    }

    /**
     * Obtiene el valor de la propiedad categorizationTier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorizationTier2() {
        return categorizationTier2;
    }

    /**
     * Define el valor de la propiedad categorizationTier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorizationTier2(String value) {
        this.categorizationTier2 = value;
    }

    /**
     * Obtiene el valor de la propiedad categorizationTier3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorizationTier3() {
        return categorizationTier3;
    }

    /**
     * Define el valor de la propiedad categorizationTier3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorizationTier3(String value) {
        this.categorizationTier3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ciName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIName() {
        return ciName;
    }

    /**
     * Define el valor de la propiedad ciName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIName(String value) {
        this.ciName = value;
    }

    /**
     * Obtiene el valor de la propiedad closureManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureManufacturer() {
        return closureManufacturer;
    }

    /**
     * Define el valor de la propiedad closureManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureManufacturer(String value) {
        this.closureManufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad closureProductCategoryTier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureProductCategoryTier1() {
        return closureProductCategoryTier1;
    }

    /**
     * Define el valor de la propiedad closureProductCategoryTier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureProductCategoryTier1(String value) {
        this.closureProductCategoryTier1 = value;
    }

    /**
     * Obtiene el valor de la propiedad closureProductCategoryTier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureProductCategoryTier2() {
        return closureProductCategoryTier2;
    }

    /**
     * Define el valor de la propiedad closureProductCategoryTier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureProductCategoryTier2(String value) {
        this.closureProductCategoryTier2 = value;
    }

    /**
     * Obtiene el valor de la propiedad closureProductCategoryTier3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureProductCategoryTier3() {
        return closureProductCategoryTier3;
    }

    /**
     * Define el valor de la propiedad closureProductCategoryTier3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureProductCategoryTier3(String value) {
        this.closureProductCategoryTier3 = value;
    }

    /**
     * Obtiene el valor de la propiedad closureProductModelVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureProductModelVersion() {
        return closureProductModelVersion;
    }

    /**
     * Define el valor de la propiedad closureProductModelVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureProductModelVersion(String value) {
        this.closureProductModelVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad closureProductName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureProductName() {
        return closureProductName;
    }

    /**
     * Define el valor de la propiedad closureProductName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureProductName(String value) {
        this.closureProductName = value;
    }

    /**
     * Obtiene el valor de la propiedad department.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Define el valor de la propiedad department.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad impact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImpact() {
        return impact;
    }

    /**
     * Define el valor de la propiedad impact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImpact(JAXBElement<String> value) {
        this.impact = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad lookupKeyword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupKeyword() {
        return lookupKeyword;
    }

    /**
     * Define el valor de la propiedad lookupKeyword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupKeyword(String value) {
        this.lookupKeyword = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategorizationTier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategorizationTier1() {
        return productCategorizationTier1;
    }

    /**
     * Define el valor de la propiedad productCategorizationTier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategorizationTier1(String value) {
        this.productCategorizationTier1 = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategorizationTier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategorizationTier2() {
        return productCategorizationTier2;
    }

    /**
     * Define el valor de la propiedad productCategorizationTier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategorizationTier2(String value) {
        this.productCategorizationTier2 = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategorizationTier3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategorizationTier3() {
        return productCategorizationTier3;
    }

    /**
     * Define el valor de la propiedad productCategorizationTier3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategorizationTier3(String value) {
        this.productCategorizationTier3 = value;
    }

    /**
     * Obtiene el valor de la propiedad productModelVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductModelVersion() {
        return productModelVersion;
    }

    /**
     * Define el valor de la propiedad productModelVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductModelVersion(String value) {
        this.productModelVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad reportedSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportedSourceType }{@code >}
     *     
     */
    public JAXBElement<ReportedSourceType> getReportedSource() {
        return reportedSource;
    }

    /**
     * Define el valor de la propiedad reportedSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportedSourceType }{@code >}
     *     
     */
    public void setReportedSource(JAXBElement<ReportedSourceType> value) {
        this.reportedSource = value;
    }

    /**
     * Obtiene el valor de la propiedad resolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Define el valor de la propiedad resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionCategoryTier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionCategoryTier1() {
        return resolutionCategoryTier1;
    }

    /**
     * Define el valor de la propiedad resolutionCategoryTier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionCategoryTier1(String value) {
        this.resolutionCategoryTier1 = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionCategoryTier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionCategoryTier2() {
        return resolutionCategoryTier2;
    }

    /**
     * Define el valor de la propiedad resolutionCategoryTier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionCategoryTier2(String value) {
        this.resolutionCategoryTier2 = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionCategoryTier3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionCategoryTier3() {
        return resolutionCategoryTier3;
    }

    /**
     * Define el valor de la propiedad resolutionCategoryTier3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionCategoryTier3(String value) {
        this.resolutionCategoryTier3 = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceTypeType }{@code >}
     *     
     */
    public JAXBElement<ServiceTypeType> getServiceType() {
        return serviceType;
    }

    /**
     * Define el valor de la propiedad serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceTypeType }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<ServiceTypeType> value) {
        this.serviceType = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad createRequest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}
     *     
     */
    public JAXBElement<CreateRequestType> getCreateRequest() {
        return createRequest;
    }

    /**
     * Define el valor de la propiedad createRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}
     *     
     */
    public void setCreateRequest(JAXBElement<CreateRequestType> value) {
        this.createRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Define el valor de la propiedad summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad urgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrgency() {
        return urgency;
    }

    /**
     * Define el valor de la propiedad urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<String> value) {
        this.urgency = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoSummary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkInfoSummary() {
        return workInfoSummary;
    }

    /**
     * Define el valor de la propiedad workInfoSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkInfoSummary(String value) {
        this.workInfoSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkInfoNotes() {
        return workInfoNotes;
    }

    /**
     * Define el valor de la propiedad workInfoNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkInfoNotes(String value) {
        this.workInfoNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoTypeType }{@code >}
     *     
     */
    public JAXBElement<WorkInfoTypeType> getWorkInfoType() {
        return workInfoType;
    }

    /**
     * Define el valor de la propiedad workInfoType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoTypeType }{@code >}
     *     
     */
    public void setWorkInfoType(JAXBElement<WorkInfoTypeType> value) {
        this.workInfoType = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkInfoDate() {
        return workInfoDate;
    }

    /**
     * Define el valor de la propiedad workInfoDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkInfoDate(String value) {
        this.workInfoDate = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoSourceType }{@code >}
     *     
     */
    public JAXBElement<WorkInfoSourceType> getWorkInfoSource() {
        return workInfoSource;
    }

    /**
     * Define el valor de la propiedad workInfoSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoSourceType }{@code >}
     *     
     */
    public void setWorkInfoSource(JAXBElement<WorkInfoSourceType> value) {
        this.workInfoSource = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoLocked.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}
     *     
     */
    public JAXBElement<CreateRequestType> getWorkInfoLocked() {
        return workInfoLocked;
    }

    /**
     * Define el valor de la propiedad workInfoLocked.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateRequestType }{@code >}
     *     
     */
    public void setWorkInfoLocked(JAXBElement<CreateRequestType> value) {
        this.workInfoLocked = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoViewAccess.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoViewAccessType }{@code >}
     *     
     */
    public JAXBElement<WorkInfoViewAccessType> getWorkInfoViewAccess() {
        return workInfoViewAccess;
    }

    /**
     * Define el valor de la propiedad workInfoViewAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkInfoViewAccessType }{@code >}
     *     
     */
    public void setWorkInfoViewAccess(JAXBElement<WorkInfoViewAccessType> value) {
        this.workInfoViewAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad middleInitial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Define el valor de la propiedad middleInitial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Obtiene el valor de la propiedad statusReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusReasonType }{@code >}
     *     
     */
    public JAXBElement<StatusReasonType> getStatusReason() {
        return statusReason;
    }

    /**
     * Define el valor de la propiedad statusReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusReasonType }{@code >}
     *     
     */
    public void setStatusReason(JAXBElement<StatusReasonType> value) {
        this.statusReason = value;
    }

    /**
     * Obtiene el valor de la propiedad directContactFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectContactFirstName() {
        return directContactFirstName;
    }

    /**
     * Define el valor de la propiedad directContactFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectContactFirstName(String value) {
        this.directContactFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad directContactMiddleInitial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectContactMiddleInitial() {
        return directContactMiddleInitial;
    }

    /**
     * Define el valor de la propiedad directContactMiddleInitial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectContactMiddleInitial(String value) {
        this.directContactMiddleInitial = value;
    }

    /**
     * Obtiene el valor de la propiedad directContactLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectContactLastName() {
        return directContactLastName;
    }

    /**
     * Define el valor de la propiedad directContactLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectContactLastName(String value) {
        this.directContactLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad templateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Define el valor de la propiedad templateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCI() {
        return serviceCI;
    }

    /**
     * Define el valor de la propiedad serviceCI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCI(String value) {
        this.serviceCI = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCIReconID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCIReconID() {
        return serviceCIReconID;
    }

    /**
     * Define el valor de la propiedad serviceCIReconID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCIReconID(String value) {
        this.serviceCIReconID = value;
    }

    /**
     * Obtiene el valor de la propiedad hpdci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPDCI() {
        return hpdci;
    }

    /**
     * Define el valor de la propiedad hpdci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPDCI(String value) {
        this.hpdci = value;
    }

    /**
     * Obtiene el valor de la propiedad hpdciReconID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPDCIReconID() {
        return hpdciReconID;
    }

    /**
     * Define el valor de la propiedad hpdciReconID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPDCIReconID(String value) {
        this.hpdciReconID = value;
    }

    /**
     * Obtiene el valor de la propiedad hpdciFormName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPDCIFormName() {
        return hpdciFormName;
    }

    /**
     * Define el valor de la propiedad hpdciFormName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPDCIFormName(String value) {
        this.hpdciFormName = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoAttachment1Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkInfoAttachment1Name() {
        return workInfoAttachment1Name;
    }

    /**
     * Define el valor de la propiedad workInfoAttachment1Name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkInfoAttachment1Name(String value) {
        this.workInfoAttachment1Name = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoAttachment1Data.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWorkInfoAttachment1Data() {
        return workInfoAttachment1Data;
    }

    /**
     * Define el valor de la propiedad workInfoAttachment1Data.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWorkInfoAttachment1Data(byte[] value) {
        this.workInfoAttachment1Data = value;
    }

    /**
     * Obtiene el valor de la propiedad workInfoAttachment1OrigSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkInfoAttachment1OrigSize() {
        return workInfoAttachment1OrigSize;
    }

    /**
     * Define el valor de la propiedad workInfoAttachment1OrigSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkInfoAttachment1OrigSize(Integer value) {
        this.workInfoAttachment1OrigSize = value;
    }

    /**
     * Obtiene el valor de la propiedad loginID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * Define el valor de la propiedad loginID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginID(String value) {
        this.loginID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCompany() {
        return customerCompany;
    }

    /**
     * Define el valor de la propiedad customerCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCompany(String value) {
        this.customerCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateID() {
        return corporateID;
    }

    /**
     * Define el valor de la propiedad corporateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateID(String value) {
        this.corporateID = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Define el valor de la propiedad vendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorOrganization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOrganization() {
        return vendorOrganization;
    }

    /**
     * Define el valor de la propiedad vendorOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOrganization(String value) {
        this.vendorOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorGroup() {
        return vendorGroup;
    }

    /**
     * Define el valor de la propiedad vendorGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorGroup(String value) {
        this.vendorGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorGroupID() {
        return vendorGroupID;
    }

    /**
     * Define el valor de la propiedad vendorGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorGroupID(String value) {
        this.vendorGroupID = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorAssigneeGroups.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorAssigneeGroups() {
        return vendorAssigneeGroups;
    }

    /**
     * Define el valor de la propiedad vendorAssigneeGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorAssigneeGroups(String value) {
        this.vendorAssigneeGroups = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorTicketNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorTicketNumber() {
        return vendorTicketNumber;
    }

    /**
     * Define el valor de la propiedad vendorTicketNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorTicketNumber(String value) {
        this.vendorTicketNumber = value;
    }

}
