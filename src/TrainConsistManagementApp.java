public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    static class Bogie {
        Bogie(int capacity) throws InvalidCapacityException {
            if (capacity <= 0)
                throw new InvalidCapacityException("Invalid Capacity");
        }
    }

    public static void main(String[] args) {
        try {
            new Bogie(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}