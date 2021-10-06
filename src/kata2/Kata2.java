package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = {1,2,3,5,6,1,3,2,2,3,4,5,1,3,6};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i : data) {
            histogram.put(i,histogram.containsKey(i) ? histogram.get(i)+1 : 1);
        }
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
    }
}
