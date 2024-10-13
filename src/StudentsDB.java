import java.util.ArrayList;
import java.util.List;


/*
* since the particular Student may know nothing about other Students
* the static StudentsDB was proposed to use as a catalog;
* but each Student knows that there is StudentsDB and can access it;
*/
public class StudentsDB {
    private static final List<Student> students = new ArrayList<>();

    public static void add(Student student){
        students.add(student);
    }
    public static void remove(Student student){
        students.remove(student);
    }
    public static List<Student> getAll(){
        return new ArrayList<>(students);
    }
    public static void clear(){
        students.clear();
    }

}
