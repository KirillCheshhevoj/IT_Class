package Lesson_11.Task4.interfaces;

public interface ICargo {
    default double getCapacityBodyVolume() {
        return 0;
    }

    double getCapacityLoad();
}
