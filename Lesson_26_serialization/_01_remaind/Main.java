package Lesson_26_serialization._01_remaind;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final String PATH_TO_INPUT = "D:\\Java\\It_class\\Main\\src\\Lesson_26_serialization\\_01_remaind\\resources\\text.file";
    private static final String PATH_TO_OUTPUT = "D:\\Java\\It_class\\Main\\src\\Lesson_26_serialization\\_01_remaind\\resources\\output.file";

    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(new FileInputStream(PATH_TO_INPUT));
//             OutputStream os = new FileOutputStream(PATH_TO_OUTPUT)) {
//            while (sc.hasNextLine()) {
//                byte[] bytes = sc.nextLine().getBytes();
//                os.write(bytes);
//                os.write("\n".getBytes());
//            }
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        try (BufferedReader br = new BufferedReader(new FileReader(PATH_TO_INPUT));
             Stream<String> stream = br.lines();
             OutputStream os = new FileOutputStream(PATH_TO_OUTPUT)) {
            String collect = stream.collect(Collectors.joining("\n"));
            os.write(collect.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
