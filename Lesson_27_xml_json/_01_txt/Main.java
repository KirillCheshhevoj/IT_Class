package Lesson_27_xml_json._01_txt;

import Lesson_27_xml_json._01_txt.model.TxtCat;
import Lesson_27_xml_json._01_txt.utils.TxtCatUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TxtCat> txtCats = TxtCatUtils.extract();
        TxtCatUtils.printCats(txtCats);
    }
}
