package adaptAssignment.genericsAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ques2 {
    public static void main(String[] args) {

        HashMap<Integer, Double> map = new HashMap<>();

        Random randomNumbers = new Random();

        for (int i = 0; i < 10; i++) {
            map.put(randomNumbers.nextInt(), randomNumbers.nextDouble());
        }

        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
        }
    }
}
