public class FactorialDemo {

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        FactorialDemo obj = new FactorialDemo();

        FactorialInterface fi = obj::factorial;

        int result = fi.calculate(5);

        System.out.println("Factorial = " + result);
    }
}