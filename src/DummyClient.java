import com.remedy.client.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;


public class DummyClient {

    String soapEndpointUrl = "http://127.0.0.1:8082/arsys/services/ARService?server=limdesrmedyv03&webService=HPD_IncidentInterface_Create_WS1";    String userName = "YOUR USERNAME";
    String password = "YOUR PASSWORD";
    String soapAction = "urn:HPD_IncidentInterface_Create_WS1/HelpDesk_Submit_Service";


    public static void main(String[] args) throws IOException, JAXBException, SOAPException {

        //String dos = "Mo\u00f3";
        //System.out.println(dos);
        if(true){
           // return;
        }
        DummyClient self;

        self = new DummyClient();


        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        MessageFactory messageFactory = MessageFactory.newInstance();

        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope envelope = soapPart.getEnvelope();
        SOAPBody soapBody = envelope.getBody();
        SOAPHeader soapHeader = envelope.getHeader();

        SOAPFactory soapFactory = SOAPFactory.newInstance();

        SOAPElement authHeaderElement = soapFactory.createElement("AuthenticationInfo");
        SOAPElement userName = soapFactory.createElement("userName");
        SOAPElement password = soapFactory.createElement("password");
        userName.addTextNode(self.userName);
        password.addTextNode(self.password);

        authHeaderElement.addChildElement(userName);
        authHeaderElement.addChildElement(password);
        soapHeader.addChildElement(authHeaderElement);


        soapBody.addDocument(self.convertStringToDocument(self.getBody()));
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", self.soapAction);

        soapMessage.saveChanges();
        SOAPMessage soapResponse = soapConnection.call(soapMessage, self.soapEndpointUrl);


        System.out.println("<---- SOAP Request!!!------>");
        System.out.println(self.getBody());
        System.out.println();

        System.out.println("<---- SOAP Response!!! ------>");
        soapResponse.writeTo(System.out);
        System.out.println();

        soapConnection.close();



    }

    private String getBody() throws JAXBException {

        ObjectFactory factory = new ObjectFactory();
        InputMapping1 mapping = getInputMapping();
        JAXBElement<InputMapping1> jaxb_mapping = factory.createHelpDeskSubmitService(mapping);

        return jaxbToXML(jaxb_mapping, InputMapping1.class);

    }

    private String jaxbToXML(JAXBElement jaxbElement, Class... className) throws JAXBException {

        JAXBContext contextForRequest =
                JAXBContext.newInstance
                        (className);


        Marshaller m = contextForRequest.createMarshaller();
        m.setProperty("jaxb.fragment", Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter st = new StringWriter();
        m.marshal(jaxbElement, st);

        return st.toString();

    }


    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);

        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(new StringReader(xmlStr)));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private InputMapping1 getInputMapping() {


        InputMapping1 InputMapping = new InputMapping1();
        InputMapping.setAssignedGroup("OYM HFC");
        InputMapping.setAssignedSupportOrganizationt("Implementaci\u00f3n HFC");
        InputMapping.setAssignee("JORGE COPIA RAMOS");
        InputMapping.setServiceCI("Energ\u00eda");
        InputMapping.setFirstName("tickets");
        InputMapping.setLastName("field");


        ObjectFactory factory = new ObjectFactory();


        InputMapping.setServiceType(factory.createInputMapping1ServiceType(
                ServiceTypeType.USER_SERVICE_RESTORATION)
        );


        InputMapping.setReportedSource(factory.createInputMapping1ReportedSource(
                ReportedSourceType.DIRECT_INPUT
        ));


        InputMapping.setNotes("Lorem ipsum dolor sit amet");
        InputMapping.setSummary("Mauris imperdiet ex non ultricies tempus. Proin finibus dapibus elit, in rutrum est hendrerit nec");

        InputMapping.setLoginID("");


        InputMapping.setImpact(factory.createInputMapping1Impact(
                "1-Extensive/Widespread"
        ));

        InputMapping.setUrgency(factory.createInputMapping1Urgency(
                "1-Critical"
        ));

        InputMapping.setCustomerCompany("Am\u00e9rica M\u00f3vil Per\u00fa SAC");
        InputMapping.setAssignedSupportCompany("Am\u00e9rica M\u00f3vil Per\u00fa SAC");

        //InputMapping.setHPDCI("LIU0885_LOS_CARRIZOS");

        InputMapping.setStatus(StatusType.ASSIGNED);
        InputMapping.setCIName("");
        return InputMapping;

    }


}
