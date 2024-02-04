package Lesson_27_xml_json._04_stax;

import Lesson_27_xml_json._00_model.CatModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CatModel> cats = StaxProcessor.parseXml();
        cats.forEach(System.out::println);
    }
}
