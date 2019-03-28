package programers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by parkey19 on 2019. 3. 28..
 */
public class marathorn {

    public static void main(String[] args) {
        marathorn marathorn = new marathorn();
//        String [] participant = {"leo", "kiki", "eden"};
//        String [] completion = { "kiki", "eden"};

        String [] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = { "stanko", "ana", "mislav"};

        String solution = marathorn.solution(participant, completion);
        System.out.println(solution);
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        Stream<String> stringStream = map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey);
        Optional<String> first = stringStream.findFirst();

        return first.orElse("");
    }

    public String failSolution(String[] participant, String[] completion){
        List<String> participantList = new ArrayList<String>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<String>(Arrays.asList(completion));
        for (String name : completionList) {
            participantList.remove(name);
        }
        // System.out.println(participantList);
        return participantList.get(0);
    }

}
