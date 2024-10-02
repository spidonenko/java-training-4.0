import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;
    private static final List<Student> students = new ArrayList<>();

    public Student() {
        this("J. Doe");
    }

    public Student(String name) {
        this(name, 0);
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        students.add(this);
    }

    // runs on destruction
    @Override
    protected void finalize() {
        students.remove(this);
    }

    public static double getAvgRating() {
        if (students == null || students.isEmpty()) { return 0d; }
        double sum = 0;
        for (var i : students) {
            sum += i.getRating();
        }
        return sum / students.size();
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
        student.finalize();
    }

    @Override
    public String toString() {
        return String.format("Student: %s (rating %d)", name, rating);
    }
}