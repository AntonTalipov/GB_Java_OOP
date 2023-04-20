package Practise6.textManipulator;

public class TextManipulator implements Actions {
    Text text;

    public TextManipulator(Text text) {
        this.text = text;
    }

    public void appendText(String newText){

        text.setText(text.getText().concat(newText));
    }
    public String findWordAndReplace(String word, String replacementWord){
        if(text.getText().contains(word)){
            text.setText(text.getText().replace(word, replacementWord));
        }
        return text.getText();
    }
    public String findWordAndDelete(String word){
        if(text.getText().contains(word)){
            text.setText(text.getText().replace(word, ""));
        }
        return text.getText();
    }
    public void printText(){
        System.out.println(text.getText());
    }


}

