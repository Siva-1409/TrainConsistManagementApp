import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        int capacity;

        Bogie(int capacity) {
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie(72),
                new Bogie(56),
                new Bogie(24)
        );

        int total = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seats: " + total);
    }
}