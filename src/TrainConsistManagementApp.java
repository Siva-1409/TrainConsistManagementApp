import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        String[] arr = {"BG101", "BG205", "BG309", "BG412"};
        Arrays.sort(arr);

        String key = "BG309";

        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}