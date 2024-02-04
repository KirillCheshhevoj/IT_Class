package Lesson_27_xml_json._06_json;

import Lesson_27_xml_json._00_model.CatModel;
import Lesson_27_xml_json._05_jaxb.model.CatJaxb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    private static final String PATH = "D:\\Java\\It_class\\Main\\src\\Lesson_27_xml_json\\_06_json\\resources\\cats.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Type TYPE = new TypeToken<List<CatModel>>() {
    }.getType();

    public static void main(String[] args) throws IOException {
        List<CatJaxb> cats = List.of(
                new CatJaxb(1, "Murzik", 2),
                new CatJaxb(2, "Barsik", 3),
                new CatJaxb(3, "Mashka", 1),
                new CatJaxb(4, "Pushok", 5)
        );

        cats.forEach(System.out::println);
        String gsonString = gson.toJson(cats);
        OutputStream os = new FileOutputStream(PATH);
        os.write(gsonString.getBytes(StandardCharsets.UTF_8));

        List<CatModel> catsFromString = gson.fromJson(new FileReader(PATH), TYPE);
        catsFromString.get(0).setAge(100);
        CatModel.value = "new";
        catsFromString.forEach(System.out::println);
    }
}
