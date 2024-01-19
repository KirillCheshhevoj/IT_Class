package Lesson_16.model.people;

import Lesson_16.model.Dog;

public class DogEnjoyer extends Person{
    private Dog favouriteObject;

    public DogEnjoyer(String name, Dog favouriteObject) {
        super(name);
        this.favouriteObject = favouriteObject;
    }

    public Dog getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(Dog favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    @Override
    public String toString() {
        return "DogEnjoyer{" +
                "favouriteObject=" + favouriteObject +
                ", name='" + getName() + '\'' +
                "} ";
    }
}
