import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        int numberOfStudents;
        int maxNumberOfStudents = 5;
        int examScore;
        String name;



        System.out.println("Enter how many students you would like to add: ");
        numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        if(numberOfStudents <= maxNumberOfStudents){
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter Name: ");
                name= scanner.nextLine();


                //grades cannot be less than 0 or over 100
                 do {
                     System.out.println("Enter Grade for: "+name);
                     examScore = scanner.nextInt();
                     scanner.nextLine();
                 } while (examScore < 0 || examScore > 100);

                 //stored in arrayList
                    names.add(name);
                    grades.add(examScore);

            }
        }
        System.out.println(names);
        System.out.println(grades);

//        After all data is entered, display:
//        Every student’s name and score
//        The highest score
//        The lowest score
//        The average score

        //calculating the average
        int sum = 0;
        for (Integer grade : grades){
            sum += grade;
        }
        //Highest grade
        int highestScore = 0;
        for (Integer grade : grades){
            //Ternary expression
            highestScore = grade.longValue() > highestScore ? grade : highestScore;
        }
        int average = sum/grades.size();
        System.out.println("The average grade is "+average);
        System.out.println("The maximum grade is "+highestScore);

    }
}