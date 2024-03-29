package Lesson_27_xml_json._02_sax;

import Lesson_27_xml_json._00_model.CatModel;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    @Getter
    private List<CatModel> cats;
    private CatModel cat;
    private String tagName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("cats")) {
            cats = new ArrayList<>();
        } else if (qName.equals("cat")) {
            cat = new CatModel();
            int regNumber = Integer.parseInt(attributes.getValue("regNumber"));
            cat.setRegNumber(regNumber);
        } else {
            tagName = qName;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("cat")) {
            cats.add(cat);
            cat = null;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            switch (tagName) {
                case "name" -> cat.setName(value);
                case "age" -> cat.setAge(Integer.parseInt(value));
            }
            tagName = null;
        }
    }
}
