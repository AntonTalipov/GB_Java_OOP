package Practise3;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String sex;
    private int year;

    public Student(String name, int age, String sex, int year) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

}