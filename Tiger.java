public class Tiger extends Animal {
    private int numberOfStripes; // Unique feature

    public Tiger(String name, int age) {
        super(name, age, "Tiger");
        this.numberOfStripes = 30; // Default example
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }
}