public class Bear extends Animal {
    private boolean isHibernating; // Unique feature

    public Bear(String name, int age) {
        super(name, age, "Bear");
        this.isHibernating = false;
    }

    public boolean isHibernating() {
        return isHibernating;
    }
}