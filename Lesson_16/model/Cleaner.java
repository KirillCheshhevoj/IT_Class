package Lesson_16.model;

public class Cleaner {
    private String model;

    public Cleaner(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void vaccum() {
        System.out.println(model + " is vacuuming the floor");
    }


    @Override
    public String toString() {
        return "Cleaner{" +
                "model='" + model + '\'' +
                '}';
    }
}
