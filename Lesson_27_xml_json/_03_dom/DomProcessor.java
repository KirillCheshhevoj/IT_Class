package Lesson_27_xml_json._03_dom;

import Lesson_27_xml_json._00_model.CatModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomProcessor {
    private static final String PATH = "D:\\Java\\It_class\\Main\\src\\Lesson_27_xml_json\\_03_dom\\resources\\cats.xml";

    public static List<CatModel> parseXml() {
        List<CatModel> cats = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new FileInputStream(PATH));
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("cat");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node item = nodeList.item(i);
                if (item.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) item;
                    CatModel cat = new CatModel();
                    cat.setRegNumber(Integer.parseInt(element.getAttribute("regNumber")));
                    cat.setName(element.getElementsByTagName("name").item(0).getTextContent());
                    cat.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
                    cats.add(cat);
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return cats;
    }
}
