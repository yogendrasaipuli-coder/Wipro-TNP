import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class CardGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cards:");
        int n = sc.nextInt();

        TreeMap<Character, ArrayList<PlayingCards>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            PlayingCards card = new PlayingCards(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<PlayingCards>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are:");

        for (Character symbol : map.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        for (Character symbol : map.keySet()) {

            System.out.println("Cards in " + symbol + " Symbol");

            ArrayList<PlayingCards> list = map.get(symbol);
            int sum = 0;

            for (PlayingCards card : list) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards: " + list.size());
            System.out.println("Sum of Numbers: " + sum);
        }

        sc.close();
    }
}