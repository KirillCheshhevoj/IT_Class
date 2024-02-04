package Lesson_27_xml_json._05_jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CatJaxb {
    @XmlAttribute
    private int regNumber;
    @XmlElement
    private String name;
    private int age;

}
