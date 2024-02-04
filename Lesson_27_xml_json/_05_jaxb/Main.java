package Lesson_27_xml_json._05_jaxb;

import Lesson_27_xml_json._05_jaxb.model.CatJaxb;
import Lesson_27_xml_json._05_jaxb.utils.CatUtils;
import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        List<CatJaxb> cats = List.of(
                new CatJaxb(1, "Murzik", 2),
                new CatJaxb(2, "Barsik", 3),
                new CatJaxb(3, "Mashka", 1),
                new CatJaxb(4, "Pushok", 5)
        );

        CatUtils.marshal(cats);

        List<CatJaxb> fromFile = CatUtils.unmarshal();
        CatUtils.printCollection(fromFile);
    }
}
