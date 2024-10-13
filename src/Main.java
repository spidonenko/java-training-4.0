public class Main {
    public static void main(String[] args) {
//        In the method main() create 3 objects of Student type
//        and input information about them.
//        Display the average rating of all students.
//        Change the rating of any student.
//        Display the new average rating.

        var st1 = new Student("Anne", 15);
        StudentsDB.add(st1);
        var st2 = new Student("Bob", 10);
        StudentsDB.add(st2);
        var st3 =  new Student("Chuck", 20);
        StudentsDB.add(st3);

        System.out.printf("Average rating of the students is %s%n", Student.getAvgRating());
        System.out.println("Changing some ratings");
        st1.changeRating(30);
        st2.changeRating(15);
        StudentsDB.getAll().forEach(i -> System.out.println(i));
        System.out.printf("Average rating of the students is %#.2f%n", Student.getAvgRating());
        StudentsDB.clear();
    }
}
