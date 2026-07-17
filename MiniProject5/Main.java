
	import java.util.*;

	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        HashSet<Character> set = new HashSet<>();
	        TreeMap<Character, Card> map = new TreeMap<>();

	        int count = 0;

	        while (set.size() < 4) {
	            System.out.println("Enter a card:");
	            char symbol = sc.next().charAt(0);
	            int number = sc.nextInt();

	            count++;

	            if (!set.contains(symbol)) {
	                set.add(symbol);
	                map.put(symbol, new Card(symbol, number));
	            }
	        }

	        System.out.println("Four symbols gathered in " + count + " cards.");
	        System.out.println("Cards in Set are");

	        for (Card c : map.values()) {
	            System.out.println(c.getSymbol() + " " + c.getNumber());
	        }

	        sc.close();
	    }
	}

