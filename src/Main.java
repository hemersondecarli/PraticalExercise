import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; ++i) {
            item.add(scanner.nextLine());
        }

        System.out.println(item);
        String chooseItem = scanner.nextLine();
        if (item.contains(chooseItem)) {
            System.out.print(chooseItem + " is in the list\n");
        }

        System.out.println("You have entered " + item.size() + " items");
    }
}