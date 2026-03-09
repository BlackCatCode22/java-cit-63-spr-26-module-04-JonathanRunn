public class Hyena extends Animal {
    private String habitat; // Unique feature

    public Hyena(String name, int age) {
        // Calls the Animal constructor: Animal(name, age, species)
        super(name, age, "Hyena");
        this.habitat = "Hyena Habitat";
    }

    public String getHabitat() {
        return habitat;
    }
}