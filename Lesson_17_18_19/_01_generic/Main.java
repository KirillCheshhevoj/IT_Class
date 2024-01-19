package Lesson_17_18_19._01_generic;

public class Main {
    public static void main(String[] args) {
//        BoxInt boxInt = new BoxInt(100500);
//        BoxStr boxStr = new BoxStr("Vasya");
//
//        System.out.println(boxInt.doSmt());
//        System.out.println(boxStr.doSmt());

//        var box1 = new GenericBox<>(250);
//        var box2 = new GenericBox<>("Petia");
//        System.out.println(box1.doSmth());
//        System.out.println(box2.doSmth());

        var classNameWriter = new ClassNameWriter();
//          classNameWriter.writeClassName(new BoxInt(100));
//        classNameWriter.writeClassName(100);
//        System.out.println(classNameWriter.returnIbj(100L).getClass().getSimpleName());
        Integer o = doSmth(123);
//        System.out.println((String) doSmth("Vasya"));
    }

    private static <T, E> T doSmth(E term) {
        return (T) term;
    }

    private static <T, E extends Number> T doSmth(int firstTerm, E secondTerm) {
        Integer result = firstTerm + secondTerm.intValue();
        return (T) result;
    }
}
