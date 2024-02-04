package Lesson_23._01_begin.model;

import lombok.*;

import java.util.Comparator;

@AllArgsConstructor
@Data
@ToString
@RequiredArgsConstructor
public class Cat implements Comparator<Cat> {
    private String name;
    private Breed type;
    int age;

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }


//    public Cat(String name, Breed type, int age) {
//        this.name = name;
//        this.type = type;
//        this.age = age;
//    }
//
//    public Cat() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Breed getType() {
//        return type;
//    }
//
//    public void setType(Breed type) {
//        this.type = type;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Lesson_23._01_begin.model.Cat{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", type=").append(type);
//        sb.append(", age=").append(age);
//        sb.append('}');
//        return sb.toString();
//    }
}
