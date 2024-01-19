package Lesson_16.model.people;

import Lesson_16.model.Cat;

public class CatEnjoyer extends Person {
    private Cat favouriteObject;

    public CatEnjoyer(String name, Cat favouriteObject) {
        super(name);
        this.favouriteObject = favouriteObject;
    }

    public Cat getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(Cat favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    @Override
    public String toString() {
        return "CatEnjoyer{" +
                "favouriteObject=" + favouriteObject +
                ", name='" + getName() + '\'' +
                "} ";
    }
}
