package lesson11.homework10.task2;

public class Main {
    public static void main(String[] args) {
        try {
            double result = Result.divisionResult();
            System.out.println("Result of division: " + result);
        }catch (InvalidIndexException | ArrayZeroDivisionException | WrongInputException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
