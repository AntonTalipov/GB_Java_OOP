package Practise3;

public class Try {
    public static void main(String[] args) {
        Person person1 = new Person(13, "Bob");
        person1.showInfo();
        System.out.println();
        person1.show();
        System.out.println(person1);
        System.out.println(person1.toString());
    }
}

class Person{
    private int age;
    private String userName;

    public Person(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public void showInfo() {
        System.out.printf("Hello! My name is %s. I`m %d years old.",userName,age);
    }
    public void show(){
        System.out.println("My name is "+userName+". I`m "+age+" years old.");
    }

    @Override
    public String toString() {
        return String.format("Hello! My name is %s. I`m %d years old.",userName,age);
    }
}
class Point{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point( int z) {
        this(z, z);
    }
    public Point(){
        this(0);
    }
}
