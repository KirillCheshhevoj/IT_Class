package Lesson_10.model;

import java.util.Comparator;

public class FlatOwnerBirthYearComparator implements Comparator<Flat> {
    @Override
    public int compare(Flat flat1, Flat flat2) {
        PersonBirthYearComparator pbc = new PersonBirthYearComparator();
        return pbc.compare(flat1.getOwner(), flat2.getOwner());
    }

}
