import java.util.*;

public class TrainConsistManagementApp {

    static class GoodsBogie {
        String shape, cargo;

        GoodsBogie(String s, String c) {
            shape = s;
            cargo = c;
        }
    }

    public static void main(String[] args) {
        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        boolean safe = list.stream().allMatch(b ->
                !(b.shape.equals("Cylindrical") && !b.cargo.equals("Petroleum"))
        );

        System.out.println("Safe: " + safe);
    }
}