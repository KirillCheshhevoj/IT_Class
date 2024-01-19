package Lesson_15.Task2;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        final String F_ARR1 = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task2" +
                File.separator + "data" +
                File.separator + "arr1.txt";
        final String F_ARR2 = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task2" +
                File.separator + "data" +
                File.separator + "arr2.txt";
        final String F_ARR3 = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task2" +
                File.separator + "data" +
                File.separator + "arr3.txt";

        final int SIZE = 10;
        final int MIN = -50;
        final int MAX = 50;
        int[] randomArr = new int[SIZE];
        int[] randomArr2 = new int[SIZE];

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(F_ARR1));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter(F_ARR2))) {
            for (int i = 0; i < SIZE; i++) {
                randomArr[i] = (int) (Math.random() * (MIN - MAX + 1) + MAX);
                randomArr2[i] = (int) (Math.random() * (MIN - MAX + 1) + MAX);
                bw.write(randomArr[i] + " ");
                bw2.write(randomArr2[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(F_ARR1));
             BufferedReader br2 = new BufferedReader(new FileReader(F_ARR2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(F_ARR3))) {

            String tmpStr = br.readLine().trim();
            String[] tmpStrings = tmpStr.split(" ");
            int tmp = 0;

            for (int i = 0; i < tmpStrings.length; i++) {
                tmp = Integer.parseInt(tmpStrings[i]);
                if ((tmp % 2 == 0)) bw.write(tmp + " ");
            }

            tmpStr = br2.readLine().trim();
            tmpStrings = tmpStr.split(" ");

            for (int i = 0; i < tmpStrings.length; i++) {
                tmp = Integer.parseInt(tmpStrings[i]);
                if ((tmp < 0)) bw.write(tmp + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully");
    }
}
