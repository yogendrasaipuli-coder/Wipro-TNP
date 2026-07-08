public class OddNumber {

    public static int isOdd(int num) {
        if (num % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(15));
        System.out.println(isOdd(10));
        System.out.println(isOdd(0));
    }
}