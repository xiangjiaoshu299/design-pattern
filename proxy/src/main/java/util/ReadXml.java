package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXml {
    private static String configFile = "src/main/resources/config.xml";

    public static Object getObject(String configTagName) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(configFile));
            NodeList nodeList = doc.getElementsByTagName(configTagName);
            Node item = nodeList.item(0);

            Node firstChild = item.getFirstChild();
            String nodeValue = item.getFirstChild().getNodeValue();
            System.out.println("检测到的类名：" + nodeValue);

            return Class.forName(nodeValue).newInstance();

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
