package Practise3;

public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private int experience;

    public Teacher(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
