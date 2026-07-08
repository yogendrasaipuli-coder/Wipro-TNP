public class EvenNumber {

    public static int isEven(int num) {
        if (num % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(15));
        System.out.println(isEven(0));
    }
}