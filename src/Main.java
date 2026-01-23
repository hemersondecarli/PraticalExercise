import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Stores the items in an array
        ArrayList<String> item = new ArrayList();

        //Asks the user to enter up to 5 items they need to buy
        for(int i = 0; i < 5; ++i) {
            item.add(scanner.nextLine());
        }
        //Prints the full shopping list
        System.out.println(item);

        //Add a feature that lets the user search for an item and tells them if it is in the list.
        String chooseItem = scanner.nextLine();
        if (item.contains(chooseItem)) {
            System.out.print(chooseItem + " is in the list\n");
        }
        //Counts how many items were entered
        System.out.println("You have entered " + item.size() + " items");
    }
}