import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Type type = Type.SCISSORS;

        System.out.println("This is a " + type.getDescription());

        for (Type types : Type.values()) {
            System.out.println(types);
        }

        conditions();

    }

    public static void conditions() {
        Type scissors = Type.SCISSORS;
        String choice;

        System.out.println("Choose between, [rock] - [paper] - [scissors]");
        choice = scanner.nextLine();

        //comparing enum with a string
        if("scissors".equalsIgnoreCase(Type.SCISSORS.getDescription())) {
            System.out.println("worked");
        }
    }
}