package Lesson_8.exam3.model;

// Знешні класс Outer
public class Cat extends Pet {
    // паля і метады ўнутранага класса (закрытая) могут быць выкарыстоўваць ва знешнім
    // праз канкрэтны аб'ект гэтага ўнутранага класса
    private CatTail tail;

    public Cat() {
        tail = new CatTail();
    }

    public Cat(String nickname, String color) {
        super(nickname);
        tail = new CatTail(color);
    }

    @Override
    public void wagTail() {
        tail.wag();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "tail=" + tail +
                ", nickname=" + getNickname() + '\'' +
                "} " + super.toString();
    }

    // аб'екты ўнутранага (inner) класа не могуць існаваць
    // без аб'ектаў знешняга
    private class CatTail {
        // нельга створываць стацік паля ў унутрыннага класса
        // удакладніць з якой версіі можна
        // public static int f1;
        private String color;

        public CatTail() {
            this("grey");
        }

        public CatTail(String color) {
            this.color = color;
        }

        // у метадах унутрыннага даступны паля і метады (статычная або нестатычная)
        // (даже закрытыя)
        // знешнега і public і protected метады яго суперклассаў
        public void wag() {
            // this - спасылка на аб'ект класса CatTail
            // Cat.this спасылка на аб'ект знешнега класса, звязаннага з бягучым
            // аб'ектам класса CatTail
            System.out.println("Catten " + getNickname() +
                    " moves his tail " + color);
        }

        @Override
        public String toString() {
            return "CatTail{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
