package Lesson_9.exam2.model;

public enum AbstractDiscount {
    UNDISCOUNTED {
        @Override
        public double discount(){
            return 1;
        }
    },
    DISCOUNTED{
        @Override
        public double discount() {
            return 0.9;
        }
    },
    REDDISCOUNTED{
        @Override
        public double discount() {
            return 0.75;
        }
    };

    public abstract double discount();
}
