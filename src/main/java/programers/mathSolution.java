package programers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by parkey19 on 2019. 3. 29..
 */
public class mathSolution {

    public static void main(String[] args) {
        mathSolution mathSolution = new mathSolution();
        int[] arr = {5,5};
        int[] solution = mathSolution.solution(arr);
        for (int i:solution
             ) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] answers) {
        int size = answers.length;
        List<Integer> first = this.crateFirst(size);
        List<Integer> second = this.crateSecond(size);
        List<Integer> third = this.crateThird(size);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (answers[i] == first.get(i))
                map.put(1, map.getOrDefault(1, 0) + 1);
            if (answers[i] == second.get(i))
                map.put(2, map.getOrDefault(1, 0) + 1);
            if (answers[i] == third.get(i))
                map.put(3, map.getOrDefault(1, 0) + 1);
        }

        HashMap<Integer, Integer> collect = map.entrySet()
                .stream()
//                .filter(m -> m.getValue()!=0)
                .sorted((e1, e2) -> {
                    if (e2.getValue().compareTo(e1.getValue()) == 0) {
                        return e2.getKey().compareTo(e1.getKey());
                    }
                    return e2.getValue().compareTo(e1.getValue());
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));

        for (Map.Entry<Integer, Integer> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        Set<Integer> integers = collect.keySet();
        int[] answer = integers.stream().mapToInt(Number::intValue).toArray();
        //
        return answer;
    }

    public List<Integer> crateFirst(int size) {
        List<Integer> firstAnswer = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            firstAnswer.add(i);
        }
        return firstAnswer;
    }

    //2, 1, 2, 3, 2, 4, 2, 5
    public List<Integer> crateSecond(int size) {
        int[] arr = {2, 1, 2, 3, 2, 4, 2, 5};
        int arrSize = 8;
        List<Integer> secondAnswer = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int index = i%arrSize;

            secondAnswer.add(arr[index]);
        }
        return secondAnswer;

    }

    public List<Integer> crateThird(int size) {
        int[] arr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int arrSize = 10;
        List<Integer> thirdAnswer = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int index = i%arrSize;

            thirdAnswer.add(arr[index]);
        }
        return thirdAnswer;
    }

    class person {

        int name;
        int count;

        public person(int name, int count) {
            this.name = name;
            this.count = count;
        }
    }
}
