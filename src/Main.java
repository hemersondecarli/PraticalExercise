import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Stores the items in an array
        ArrayList<String> item = new ArrayList();

        //Asks the user to enter up to 5 items they need to buy
        for(int i = 0; i < 5; ++i) {
            System.out.printf("Enter item number [%d]: ", i+1);
            item.add(scanner.nextLine());
        }
        //Prints the full shopping list
        System.out.println(item);

        //Add a feature that lets the user search for an item and tells them if it is in the list.
        System.out.println("Enter item name to search on the list");
        String chooseItem = scanner.nextLine();
        if (item.contains(chooseItem)) {
            System.out.print(chooseItem + " is in the list\n");
        }else{
            System.out.println("the item is not in the list");
        }
        //Counts how many items were entered
        System.out.println("You have " + item.size() + " items in the list");
    }
}