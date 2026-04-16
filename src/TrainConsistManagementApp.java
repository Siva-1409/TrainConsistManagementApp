import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        String trainId = "TRN-1234";
        String cargo = "CRG-567";

        boolean trainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean cargoValid = Pattern.matches("CRG-\\d{3}", cargo);

        System.out.println(trainValid);
        System.out.println(cargoValid);
    }
}