package kata2;


import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
       String[] data = {"Rosa","Margarita","Petunia","Rosa","Calendula","Petunia","Rosa","Rosa","Margarita"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        for (Map.Entry<String,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
    }
}
