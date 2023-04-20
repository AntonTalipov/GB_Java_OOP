package Practise6.textManipulator;

public class Test {
    public static void main(String[] args) {

        Text text = new Text("FFFF");
        TextManipulator textManipulator = new TextManipulator(text);
        textManipulator.appendText("fff");
        System.out.println(text);
    }
}
