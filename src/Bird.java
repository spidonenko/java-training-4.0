abstract public class Bird {
    // TODO fix class declaration

    public void eat() {
        // TODO print a message that bird is eating
        System.out.printf(" - %s is eating\n", this.toString());
    }

    @Override
    public String toString() {
        // no need to override the method in each child class
        //      because the Class name can be got there
        return this.getClass().getName();
    }
}