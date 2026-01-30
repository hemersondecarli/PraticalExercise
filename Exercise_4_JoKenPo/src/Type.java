import java.util.Random;

public enum Type {


    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    public String description;

    private Type(String description) {
        this.description = description;
    }

    public static Random random = new Random();
    private static final Type[] VALUES = values();

    public static Type computerChoice(){
        return VALUES[random.nextInt(VALUES.length)];
    }


    public String getDescription() {
        return description;
    }



}
