package practice;

public class OddEven {
    public static void main(String[] args) {
        // Change this number to test
        int number = 14; 

        // If a number is perfectly divisible by 2, the remainder (%) is 0
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}