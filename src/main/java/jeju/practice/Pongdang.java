package jeju.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Pongdang {
    public static void main(String[] args) {

        int[] arr1 = {1,2,1,4};
        int[] arr2 = {5,3,4,1,3,8,3};

        List<Dock> docks = makeDockList();
        List<Dock> docks1 = surviveDoce(arr1, docks);
        List<Dock> docks2 = surviveDoce(arr2, docks);

        System.out.println(" 건넌자1 : " + getDockNames(docks1));
        System.out.println(" 건넌자2 : " + getDockNames(docks2));

    }

    static List<Dock> surviveDoce(int[] arrStone, List<Dock> dockList) {
        int size = dockList.size();
        int stoneSize = arrStone.length-1;
        List<Dock> surviveList = new ArrayList<>(dockList);
        for (int i = 0; i < size; i++) {
            Dock dock = dockList.get(i);
            int jump = dock.getJump()-1;
            while (jump < stoneSize) {
                int result = arrStone[jump] - dock.getWeight();
                if (result >= 0) {
                    arrStone[jump] = result;
                } else {
                    // list에서 제거
                    surviveList.remove(dock);
                    arrStone[jump] = 0;
                }
                jump += dock.getJump();
            }
        }
        return surviveList;
    }

    static List<Dock> makeDockList() {
        return Arrays.asList(
                new Dock("루비독", "95년생", 3,4),
                new Dock("피치독", "95년생", 3,3),
                new Dock("씨-독", "72년생", 2,1),
                new Dock("코볼독", "59년생", 1,1)
        );
    }

    static String getDockNames(List<Dock> dockList) {
        return dockList.stream().map(Dock::getName).collect(joining(","));
    }
}


class Dock {
    String name;
    String age;
    int jump;
    int weight;

    @Override
    public String toString() {
        return "Dock{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", jump='" + jump + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Dock(String name, String age, int jump, int weight) {
        this.name = name;
        this.age = age;
        this.jump = jump;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
