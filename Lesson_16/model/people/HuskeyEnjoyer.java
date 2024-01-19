package Lesson_16.model.people;

import Lesson_16.model.Huskey;

public class HuskeyEnjoyer extends Person {
    private Huskey favouriteObject;

    public HuskeyEnjoyer(String name, Huskey favouriteObject) {
        super(name);
        this.favouriteObject = favouriteObject;
    }

    public Huskey getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(Huskey favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    @Override
    public String toString() {
        return "HuskeyEnjoyer{" +
                "favouriteObject=" + favouriteObject +
                ", name='" + getName() + '\'' +
                "} ";
    }
}
