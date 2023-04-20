package Practise6.textManipulator;

public interface Actions {
    void appendText(String newText);
    String findWordAndReplace(String word, String replacementWord);
    String findWordAndDelete(String word);
    void printText();

}
