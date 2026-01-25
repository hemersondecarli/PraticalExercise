import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Storing
        ArrayList <String> names = new ArrayList<>();
        ArrayList <String> phoneNo = new ArrayList<>();


        //Asks the user how many contacts they want to store (max 5)
        int choice;
        boolean nameDuplicate = false;

        System.out.print("How many contacts do you want to store?: ");
        choice = scanner.nextInt();
        scanner.nextLine();

    if (choice <= 5) {
        for (int i = 0; names.size() < choice; i++) {
            System.out.printf("Enter contact no. %d: ", i + 1);
            String nameToAdd = scanner.nextLine();

            //Checks for name duplicate
            for (String name : names){
                if(name.equalsIgnoreCase(nameToAdd)){
                    nameDuplicate = true;
                    break;
                }

            }
            //if name duplicate is found
            if(nameDuplicate){
                System.out.println("Contact already exists");
                i--;
                nameDuplicate = false;
            }
            //if not found do this
            else {
                names.add(nameToAdd);
                System.out.println("Enter phone no.");
                phoneNo.add(scanner.nextLine());
            }
        }
    }else {
        System.out.println("You can only store up to 5 contacts");
        return;
    }

        //Print all contacts in this format:
//        1. Alice - 0851234567
//        2. Bob - 0879876543
        for  (int i = 0; i < names.size(); i++) {
            System.out.printf(names.get(i)+" - ");
            System.out.println(phoneNo.get(i));
        }

        //Ask the user to enter a name to search
        System.out.println("Now you must enter a name to search on the ArrayList");
        String searchName;
        searchName = scanner.nextLine();
        boolean isFound = false;

        // If the name exists:
        // Print the phone number
        //Make the search case-insensitive
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equalsIgnoreCase(searchName)) {
                System.out.println(names.get(i) + "'s phone number is: " + phoneNo.get(i));
                isFound = true;
            }
        }

        // If it does not exist:
        // Print "Contact not found"
        if(!isFound) {
            System.out.println("Contact not found!");
        }




        //Extra challenges
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