package Practise3;

import java.util.*;

//-Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//-реализовать контракт compare() со сравнению по какому-либо параметру (пример: сочетание Имя-Фамилия)
//ДЗ :
//        К коду с семинара добаить класс Teacher и возможность итерации и компорации для него. Так же для
//        учебной группы добавить преподавателя(У группы может быть только один преподаватель, у проподавателя
//        сколько угодно групп)

public class Main {
    public static void main(String[] args) {
        StudentGroup students = new StudentGroup("Ekaterina", 35, 7);
        students.getStudents().add(new Student("Bob",23, "Male", 2021));
        students.getStudents().add(new Student("Olesya",21, "Female", 2020));
        students.getStudents().add(new Student("Nastya",24, "Female", 2019));
        students.getStudents().add(new Student("Denis",25, "Male", 2019));
        students.getStudents().add(new Student("Vova",20, "Male", 2023));
        Collections.sort(students.getStudents());
        Iterator<Student> iter =students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();
        TeacherComunity teachers = new TeacherComunity();
        teachers.getTeachers().add(new Teacher("Ekaterina", 35, 7));
        teachers.getTeachers().add(new Teacher("Valentina", 55, 23));
        teachers.getTeachers().add(new Teacher("Danil", 28, 3));
        teachers.getTeachers().add(new Teacher("Anton", 40, 13));
        Collections.sort(teachers.getTeachers());
        Iterator<Teacher> iter1 = teachers.iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }
    }
}