package WrapperClasses;
public class NumberConversion {

    public static void main(String[] args) {

        try {

            if (args.length != 1) {
                System.out.println("Please enter one integer as command line argument.");
                return;
            }

            int number = Integer.parseInt(args[0]);

            System.out.println("Given Number : " + number);
            System.out.println("Binary equivalent : " + Integer.toBinaryString(number));
            System.out.println("Octal equivalent : " + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent : " + Integer.toHexString(number).toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}