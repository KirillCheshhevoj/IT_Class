package Lesson_8.exam3.model;

public class Dog extends Pet {

    private DogTail tail;

    public Dog() {
        tail = new DogTail();
    }

    public Dog(String nickname, String color) {
        super(nickname);
        tail = new DogTail(color);
    }

    @Override
    public void wagTail() {
        tail.wag();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tail=" + tail +
                ", nickname=" + getNickname() + '\'' +
                "} " + super.toString();
    }

    public class DogTail {
        private String color;

        public DogTail() {
            this("grey");
        }

        public DogTail(String color) {
            this.color = color;
        }

        public void wag() {
            System.out.println("Puppy " + getNickname() +
                    " moves his tail " + color);
        }

        @Override
        public String toString() {
            return "DogTail{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
