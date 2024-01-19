package Lesson_16.model.people;

public class PersonObj {
    private String name;
    private Object favouriteObject;

    public PersonObj(String name, Object favouriteObject) {
        this.name = name;
        this.favouriteObject = favouriteObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(Object favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    @Override
    public String toString() {
        return "PersonObj{" +
                "name='" + name + '\'' +
                ", favouriteObject=" + favouriteObject +
                '}';
    }
}
