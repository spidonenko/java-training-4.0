public class Student {
    private int rating;
    private String name;

    public Student() {
        this("J. Doe");
    }

    public Student(String name) {
        this(name, 0);
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double getAvgRating() {
        // using off-the-shelf methods to get an average value of a set
        return StudentsDB.getAll().stream().mapToInt(i -> i.getRating()).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        this.setRating(rating);
    }

    public static void removeStudent(Student student) {
        StudentsDB.remove(student);
    }

    @Override
    public String toString() {
        return String.format("Student: %s (rating %d)", name, rating);
    }
}