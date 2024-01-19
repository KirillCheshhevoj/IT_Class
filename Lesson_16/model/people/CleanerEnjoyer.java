package Lesson_16.model.people;

import Lesson_16.model.Cleaner;

public class CleanerEnjoyer extends Person{
    private Cleaner favouriteObject;

    public CleanerEnjoyer(String name, Cleaner favouriteObject) {
        super(name);
        this.favouriteObject = favouriteObject;
    }

    public Cleaner getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(Cleaner favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    @Override
    public String toString() {
        return "CleanerEnjoyer{" +
                "favouriteObject=" + favouriteObject +
                ", name='" + getName() + '\'' +
                "} ";
    }
}
