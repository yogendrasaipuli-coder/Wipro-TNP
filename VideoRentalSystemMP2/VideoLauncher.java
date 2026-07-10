import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");
            
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video to add: ");
                    String name = sc.nextLine();
                    videoStore.addVideo(name);
                    break;
                case 2:
                    System.out.print("Enter the name of the video to check out: ");
                    String checkOutName = sc.nextLine();
                    videoStore.doCheckout(checkOutName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video to return: ");
                    String returnName = sc.nextLine();
                    videoStore.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video to rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating (1-5): ");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(rateName, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}