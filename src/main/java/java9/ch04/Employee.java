package java9.ch04;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static double average(Measurable[] objects) {
        return Arrays.stream(objects).mapToDouble(Measurable::getMeasure).average().getAsDouble();
    }

    public static Measurable largest(Measurable[] objects) {
        return Arrays.stream(objects)
                .sorted(Comparator.comparingDouble(Measurable::getMeasure).reversed())
                .findFirst()
                .orElse(null);
    }
}
