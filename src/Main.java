import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        In the method main() create 3 objects of Student type
//        and input information about them.
//        Display the average rating of all students.
//        Change the rating of any student.
//        Display the new average rating.

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anne", 15));
        students.add(new Student("Bob", 10));
        students.add(new Student("Chuck", 20));

        System.out.println(String.format("Average rating of the students is %s", Student.getAvgRating()));
        System.out.println("Changing some ratings");
        students.get(0).changeRating(30);
        students.get(1).changeRating(15);
        students.forEach(i -> { System.out.println(i); });
        System.out.println(String.format("Average rating of the students is %#.2f", Student.getAvgRating()));
    }
}
