public class TrainConsistManagementApp {

    public static void main(String[] args) {
        String[] arr = {"BG101", "BG205", "BG309"};
        String key = "BG309";

        boolean found = false;

        for (String id : arr) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}