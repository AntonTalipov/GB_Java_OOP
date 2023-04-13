package Practise3;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {
    private List<Teacher> teachers;
    private int count;
    public TeacherIterator(List<Teacher> teachers) {
        this.count = 0;
        this.teachers = teachers;
    }

    @Override
    public boolean hasNext() {
        return count<teachers.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        } else {
            return teachers.get(count++);
        }
    }
}
