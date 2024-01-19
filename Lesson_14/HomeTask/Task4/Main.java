package Lesson_14.HomeTask.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String FILE_IN = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task4\\in4.txt";
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task4\\out4.txt";
        final int MAX_SIZE = 100;
        int tmp=0;

        try(FileInputStream fis = new FileInputStream(FILE_IN);
            FileOutputStream fos = new FileOutputStream(FILE_OUT)) {

            while((tmp=fis.read())!=-1){
                if((tmp>='0' && tmp<='9') || (tmp>='A' &&tmp<='Z')){
                    fos.write(tmp);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
