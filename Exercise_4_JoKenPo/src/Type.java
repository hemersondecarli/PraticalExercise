public enum Type {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),;

    private String description;

    private Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
