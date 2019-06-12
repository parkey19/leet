package java9.ch04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by parkey19 on 2019. 6. 12..
 */
public class Employee implements Measurable {

    private String name;
    private double salary;

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public double average(Measurable[] objects) {
        return Arrays.stream(objects).mapToDouble(Measurable::getMeasure).average().getAsDouble();
    }

    Measurable largest(Measurable[] objects) {
//        Arrays.stream(objects).sorted(Comparator.comparing(Employee::getMeasure))
        return null;
    }
}
