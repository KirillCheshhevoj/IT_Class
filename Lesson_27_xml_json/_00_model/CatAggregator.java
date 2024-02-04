package Lesson_27_xml_json._00_model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import Lesson_27_xml_json._05_jaxb.model.*;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "cats")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class CatAggregator {
    @XmlElement(name = "cat")
    private List<CatJaxb> cats;
}
