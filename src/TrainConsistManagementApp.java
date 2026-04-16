public class TrainConsistManagementApp {

    static class CargoException extends RuntimeException {
        CargoException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        try {
            String shape = "Rectangular";
            String cargo = "Petroleum";

            if (shape.equals("Rectangular") && cargo.equals("Petroleum"))
                throw new CargoException("Unsafe!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}