import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) list.add(i);

        long start = System.nanoTime();
        int sum = 0;
        for (int i : list) sum += i;
        long end = System.nanoTime();
        System.out.println("Loop: " + (end - start));

        start = System.nanoTime();
        int sum2 = list.stream().mapToInt(i -> i).sum();
        end = System.nanoTime();
        System.out.println("Stream: " + (end - start));
    }
}