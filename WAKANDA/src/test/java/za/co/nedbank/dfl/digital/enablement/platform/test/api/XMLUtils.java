package za.co.nedbank.dfl.digital.enablement.platform.test.api;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLUtils {

    public Logger logger = Logger.getLogger("XmlUtilsLogger");

    public String getValue(String xml, String valueToGet){
        String value = null;

        System.out.println(xml);
        try {
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            InputSource source = new InputSource(new ByteArrayInputStream(xml.getBytes("UTF-8")));
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(source);

            String parentTagName = null;
            String childTagName = null;
            String attributeCode = null;

            switch (valueToGet){
                case "cis" :
                    parentTagName = "dat:TCRMPartyIdentificationBObj";
                    childTagName = "dat:IdentificationNumber";
                    attributeCode = "1041";
                    break;

                case "startDate":
                    parentTagName = "dat:TCRMPartyIdentificationBObj";
                    childTagName = "dat:StartDate";
                    attributeCode = "1018";
                    break;

                case "Occurrences":
                    parentTagName = "dat:TCRMPartyIdentificationBObj";
                    childTagName = "dat:XIdentifierOccurrenceNumber";
                    attributeCode = "1018";
                    break;
            }

            NodeList nodes = document.getElementsByTagName(parentTagName);
            NodeList identificationIdPKNodes = document.getElementsByTagName(childTagName);

            for(int i = 0; i<nodes.getLength(); i++){
                Node node = nodes.item(i);

                logger.log(Level.WARNING,"this current iteration"+i);

                String nodeContent = node.getTextContent();
                logger.log(Level.INFO,"Logging Node Content "+ nodeContent);

                if(nodeContent.indexOf(attributeCode) >= 0){
                    logger.log(Level.INFO, "I would love to get CIS here while I is " + i);
                    value = identificationIdPKNodes.item(i).getTextContent();
                }
                else{
                    logger.log(Level.INFO,"Not this number");
                }
            }

            logger.log(Level.INFO,"value is=" + value);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }
}
