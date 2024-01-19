package Lesson_12.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = null;
        // патэнцыйна небяспечны код
        try {
            fr = new FileReader("1.txt");
            // пры ўзнікненні выключнай сітуацыі блок try далей не
            // выконваецца і пачынае выконваць блок catch
        }
        //FileNotFoundException exception = new FileNotFoundException()
        catch (IOException exception) { // апісваем пераменную тыпа выключэння
            // тое што павінна адбывацца пры наяўнасці выключнай сітуацыі
            System.out.println("Not found fail.");
            exception.printStackTrace();
            System.out.println(exception);
        } finally {
            // Гэты блок выканаецца заўсёды абавязкова
            if (fr != null)
                try {
                    fr.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            System.out.println("This block is always required to be executed");
        }
    }
}

