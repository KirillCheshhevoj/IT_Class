package Lesson_20.hw;

import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        Map<String, Departments> dict = new HashMap<>();
        Departments gomelDep = new Departments(Arrays.asList("Vetka", "Dobrush"));
        Departments brestDep = new Departments(Arrays.asList("Pinsk", "Kobrin"));

        gomelDep.addDepartments("Mozyr");
        dict.put(Regions.GOMEL.value, gomelDep);
        dict.put(Regions.BREST.value, brestDep);
        System.out.println(dict);

    }

    private static enum Regions {
        GOMEL("Gomel"),
        BREST("Brest");
        String value;

        Regions(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private static class Departments {
        List<String> departments;

        public Departments(List<String> departments) {
            this.departments = new ArrayList<>(departments);
        }

        private void addDepartments(String dep) {
            departments.add(dep);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            for (String dep : departments) {
                sb.append(dep).append("; ");
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
