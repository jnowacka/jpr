package domParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class WisielecParser {

	public List<String> parse(String filePath, String type) {
		File fXmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		List<String> hasla = new ArrayList<>();
		
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			NodeList nList = doc.getElementsByTagName("haslo");
			for(int  i = 0; i < nList.getLength(); i++) {
				Node n = nList.item(i);
				Element nodeAsElement = (Element)n;
				String lenght = nodeAsElement.getAttribute("lenght");
				if(lenght.equals(type)) hasla.add(n.getTextContent());
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hasla;
		
	}
	
}
