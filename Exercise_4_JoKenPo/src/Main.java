import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        //System.out.println("This is a " + type.getDescription());

//        for (Type types : Type.values()) {
//            System.out.println(types);
//        }

        conditions();

    }

    public static void conditions() {
        Type scissors = Type.SCISSORS;
        String choice;

        //scissors.computerChoice();

        System.out.println("Choose between, [rock] - [paper] - [scissors]");
        choice = scanner.nextLine();

        switch (choice) {
            case "rock": rock(); break;
            case "paper": paper(); break;
            case "scissors": scissors(); break;
            default: System.out.println("Invalid choice");
        }
    }

    public static void scissors(){
        Type scissors = Type.SCISSORS;
        //comparing enum with a string
        //Scissors
        if("scissors".equalsIgnoreCase(scissors.computerChoice())) {
            System.out.println("It's a Draw");
        }else if ("scissors".equalsIgnoreCase(scissors.computerChoice())) {
            System.out.println("You Lost!");
        }else if ("scissors".equalsIgnoreCase(scissors.computerChoice())) {
            System.out.println("You Won!");
        }
    }

    public static void rock(){
        Type rock = Type.ROCK;

        if("rock".equalsIgnoreCase(rock.computerChoice())) {
            System.out.println("You Won!");
        }else if ("rock".equalsIgnoreCase(rock.computerChoice())) {
            System.out.println("It's a Draw");
        }else if ("rock".equalsIgnoreCase(rock.computerChoice())) {
            System.out.println("You Lost!");
        }
    }

    public static void paper(){
        Type paper = Type.PAPER;

        if("paper".equalsIgnoreCase(paper.computerChoice())) {
            System.out.println("You Lost!");
        }else if ("paper".equalsIgnoreCase(paper.computerChoice())) {
            System.out.println("You Won!");
        }else if ("paper".equalsIgnoreCase(paper.computerChoice())) {
            System.out.println("It's a Draw");
        }
    }
}