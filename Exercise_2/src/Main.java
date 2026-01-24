import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Storing
        ArrayList <String> names = new ArrayList();
        ArrayList <String> phoneNo = new ArrayList();


        //Asks the user how many contacts they want to store (max 5)
        int choice;
        System.out.print("How many contacts do you want to store?: ");
        choice = scanner.nextInt();
        scanner.nextLine();
    if (choice <= 5) {
        for (int i = 0; i < choice; i++) {
            System.out.printf("Enter contact no. %d: ", i + 1);
            names.add(scanner.nextLine());
            System.out.println("Enter phone no.");
            phoneNo.add(scanner.nextLine());
        }
    }else{
        System.out.println("You can only store up to 5 contacts");
    }

        //Print all contacts in this format:
//        1. Alice - 0851234567
//        2. Bob - 0879876543

        //Ask the user to enter a name to search

//        If the name exists:
//        Print the phone number


//        If it does not exist:
//        Print "Contact not found"


        //Extra challenges
        //Make the search case-insensitive
        //
        //Prevent duplicate names
        //
        //Allow the user to update a phone number
        //
        //Ask if they want to search again (loop)
        //
        //Format phone numbers consistently
    }
}