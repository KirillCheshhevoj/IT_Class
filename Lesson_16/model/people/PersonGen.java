package Lesson_16.model.people;

// <T> - параметрызацыя класса, абагульненне

// параметрызаваць можна класы, інтэрфейсы і метады
// Нельга выключэнні

// public class PersonGen<T> { параметрызаваць можна кожным класам
// public class PersonGen<T extend Pet> { параметрызаваць можна
// кожным класам Pet і яго наследнікамі, які рыалізуюць
// інтэрфейсы Comparable і Cloneable

public class PersonGen<T> {
    private String name;
    private T favouriteObject;

    // static private T field; - поле параметрызаваннага тыпа
    // не можа быць статычным
    // private T[] arr = new T[10];
    // можна створываць спасылку на массіў
    // параметрызіраваннага тыпу, но вылучыць памяць
    // пад такі массіў нельга
    public PersonGen(String name, T favouriteObject) {
        this.name = name;
        this.favouriteObject = favouriteObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getFavouriteObject() {
        return favouriteObject;
    }

    public void setFavouriteObject(T favouriteObject) {
        this.favouriteObject = favouriteObject;
    }

    // PersonGen<T> person - параметр, які прыходзяць, патрэбен быць параметрызован
    // таксамым тыпам як аб'ект, для якога рабіцца выклік метада

    // wildcard ?
    // public void greeting(PersonGen<?> person) {
    // можа быць параметрызован кожны тып

    // public void greeting(PersonGen<? extend Dog> person) {
    // можа быць параметрызован класам Dog і яго падкласам
    public void greeting(PersonGen<?> person) {
        System.out.println(name + " hello " + person.name);
    }

    @Override
    public String toString() {
        return "personGen{" +
                "name='" + name + '\'' +
                ", favouriteObject=" + favouriteObject +
                '}';
    }
}
