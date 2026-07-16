import java.util.*;

public class BoxSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        Set<BoxData> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = sc.nextDouble();

            System.out.println("Enter Width");
            double width = sc.nextDouble();

            System.out.println("Enter Height");
            double height = sc.nextDouble();

            set.add(new BoxData(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");

        for (BoxData b : set) {
            System.out.println("Length - " + b.getLength()
                    + " Width - " + b.getWidth()
                    + " Height - " + b.getHeight());
            System.out.printf("Volume - %.2f%n", b.getVolume());
        }

        sc.close();
    }
}