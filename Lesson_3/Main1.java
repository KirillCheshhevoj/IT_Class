package Lesson_3;

public class Main1 {
    public static void main(String[] args) {
        // String - immutable class (нельга змяніць створанны аб'ект)
        String str1 = "Ivan"; // byte[4] LATIN1
        // String str1 = "Іван" // byte[8] UTF16
        String str2 = "Ivan";
        String str3 = new String("Ivan");

        // пры параўнанні значэнняў пры дапамозе ==
        // адбываецца параўнанне спасылак
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        // для параўнанні аб'ектаў выкарыстаўвают метад equals
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));

        String str4 = " Ivan   ";
        str4 = str4.trim();
        System.out.println(str1 == str4);
    }
}
