package programers;

import java.util.*;

/**
 * Created by parkey19 on 2019. 3. 29..
 */
public class mathSolution {

    public static void main(String[] args) {
        mathSolution mathSolution = new mathSolution();
        int[] arr = {1,2,3,4,5};
        mathSolution.solution(arr);
    }

    public int[] solution(int[] answers) {
        int size = answers.length;
        List<Integer> first = this.crateFirst(size);
        List<Integer> second = this.crateSecond(size);
        List<Integer> third = this.crateThird(size);

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < size; i++) {
            if (answers[i] == first.get(i))
                one++;
            if (answers[i] == second.get(i))
                two++;
            if (answers[i] == third.get(i))
                three++;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        map.put(3,3);
        map.put(2,4);
        map.put(1,1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        int[] answer = {};
        //
        Arrays.sort(answer);
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
