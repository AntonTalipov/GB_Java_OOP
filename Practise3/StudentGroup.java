package Practise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentGroup extends Teacher implements Iterable<Student> {
    private List<Student> students;

//    public StudentGroup(Teacher teacher) {
//        super(teacher.getName(),teacher.getAge(),teacher.getExperience());
//        List<Student> students = new ArrayList<>();
//        this.students = students;
//        System.out.println("This group ---> "+teacher.getName());
//    }
//

    public StudentGroup(String name, int age, int experience) {
        super(name, age, experience);
        List<Student> students = new ArrayList<>();
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

}
