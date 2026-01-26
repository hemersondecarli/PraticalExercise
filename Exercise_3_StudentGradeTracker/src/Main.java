import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        int numberOfStudents;
        int maxNumberOfStudents = 5;


        System.out.println("Enter how many students you would like to add: ");
        numberOfStudents = scanner.nextInt();

        if(numberOfStudents <= maxNumberOfStudents){
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter student name: ");
                names.add(scanner.next());
                System.out.println("Enter student grade: ");
                grades.add(scanner.nextInt());
            }
        }
    }
}