package Lesson1;

public class Robot1 {
    private int level;
    private String name;

    public Robot1( String name, int level) {
        this.level = level;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getLevel() {

    return this.level;
    }
    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    private void startBIOS(){
        System.out.println("Start BIOS...");
    }
    private void startOS(){
        System.out.println("Start OS...");
    }
    private void sayHi(){
        System.out.println("Hello world...");
    }
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }
    private void stopOS(){
        System.out.println("Stop OS...");
    }
    private void sayBye(){
        System.out.println("Bye...");
    }
    public void work(){
        System.out.println("Working...");
    }
}
