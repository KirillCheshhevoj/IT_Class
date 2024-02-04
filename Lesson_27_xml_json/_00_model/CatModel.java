package Lesson_27_xml_json._00_model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class CatModel {
    public static String value = "value";
    private int regNumber;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "CatModel{" +
                "static = " + value + '\'' +
                "regNumber=" + regNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
