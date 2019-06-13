package java9.ch04;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        Employee em1 = new Employee("a",1000);
        Employee em2 = new Employee("b", 2000);
        List<Measurable> list = new ArrayList<>();
        list.add(em1);
        list.add(em2);
        Measurable[] objects = {em1, em2};
        System.out.println(Employee.average(objects));
        System.out.println(Employee.largest(objects).getMeasure());

    }
}
