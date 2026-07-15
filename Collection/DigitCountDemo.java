public class DigitCountDemo {

    public static int digitCount(int n) {

        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        DigitCountInterface d = DigitCountDemo::digitCount;

        int number = 123456;

        System.out.println("Number = " + number);
        System.out.println("Number of Digits = " + d.count(number));
    }
}