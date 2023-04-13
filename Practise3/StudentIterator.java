package Practise3;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private List<Student> students;
    private int count;
    public StudentIterator(List<Student> students) {
        this.count = 0;
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return count<students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        } else {
            return students.get(count++);
        }
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
