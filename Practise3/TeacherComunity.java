package Practise3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherComunity implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeacherComunity() {
        List<Teacher> teachers = new ArrayList<>();
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(teachers);
    }



}
