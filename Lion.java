public class Lion extends Animal {
    private String maneColor; // Unique feature

    public Lion(String name, int age) {
        super(name, age, "Lion");
        this.maneColor = "Tan";
    }

    public String getManeColor() {
        return maneColor;
    }
}