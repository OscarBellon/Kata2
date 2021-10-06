package kata2;


import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = {1,2,3,5,6,1,3,2,2,3,4,5,1,3,6};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
    }
}
