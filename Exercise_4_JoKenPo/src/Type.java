import java.util.Random;
public enum Type {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),;

    private String description;

    private Type(String description) {
        this.description = description;
    }

    String computerChoice(){
    Type randomChoice = Type.values()[
            new Random().nextInt(Type.values().length)
            ];

         System.out.println(randomChoice.getDescription());

        return randomChoice.getDescription();
    }


    public String getDescription() {
        return description;
    }



}
