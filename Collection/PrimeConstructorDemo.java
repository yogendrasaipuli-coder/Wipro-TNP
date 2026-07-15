public class PrimeConstructorDemo {

    public PrimeConstructorDemo(int n) {

        if (isPrime(n))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        PrimeCheckInterface p = PrimeConstructorDemo::new;

        p.create(17);
        p.create(20);
    }
}