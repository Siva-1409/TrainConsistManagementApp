import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String type;

        Bogie(String type) {
            this.type = type;
        }
    }

    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper"),
                new Bogie("AC"),
                new Bogie("Sleeper")
        );
        Map<String, List<Bogie>> map =
                list.stream().collect(Collectors.groupingBy(b -> b.type));

        System.out.println(map);
    }
}