import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;
    private static List<Student> students = new ArrayList<>();

    // TODO implement Student class according to the instructions provided in the README.md file
    public Student() {
        this("J. Doe");
    }
    public Student(String name){
        this(name, 0);
    }
    public Student(String name, int rating) {
        //TODO initialize name
        this.name = name;
        this.rating = rating;
        students.add(this);
    }
    // runs on destruction
    @Override
    protected void finalize(){
        students.remove(this);
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        if (students == null || students.isEmpty()){ return 0d; }
        double sum = 0;
        for (var i : students){
            sum += i.getRating();
        }
        return sum/students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO set student's name
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating;
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        this.setRating(rating);
    }

    public static void removeStudent(Student student) {
        // TODO remove student
        student.finalize();
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return String.format("Student: %s (rating %d)", name, rating);
    }
}