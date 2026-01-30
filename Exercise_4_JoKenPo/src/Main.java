import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        String userInput;


        //checks what the computer chose
        Type computerChoice = Type.computerChoice();
        System.out.println("Computer chose: " + computerChoice);

        System.out.println("Choose between, [rock] - [paper] - [scissors]");
        userInput = scanner.nextLine().toLowerCase();

        //this will be compared against Enum values
        Type userChoice;
        
        switch (userInput) {
            case "rock": userChoice = Type.ROCK; break;
            case "paper": userChoice = Type.PAPER; break;
            case "scissors": userChoice = Type.SCISSORS; break;
            default: System.out.println("Invalid choice");
            return;
        }

        //Conditions
        if(userChoice == computerChoice){
            System.out.println("Its a draw!");
        }else if   (userChoice == Type.ROCK && computerChoice == Type.SCISSORS ||
                    userChoice == Type.PAPER && computerChoice == Type.ROCK ||
                    userChoice == Type.SCISSORS && computerChoice == Type.PAPER) {
            System.out.println("You win!");
        }
        else if(userChoice == Type.ROCK &&  computerChoice == Type.PAPER ||
                userChoice == Type.SCISSORS &&  computerChoice == Type.ROCK ||
                userChoice == Type.PAPER &&  computerChoice == Type.SCISSORS) {
            System.out.println("You Lost!");}
    }
}