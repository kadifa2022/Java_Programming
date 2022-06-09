package lab5_string_loop_selfpractice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Java C# Python Java";

        String temp = sentence.replace("Java", "Python");
        int totalNumberOfJava = sentence.length() - temp.length();
        int original_length=sentence.length();
        int new_length=temp.length();
        System.out.println(new_length);
        System.out.println(original_length);

        totalNumberOfJava = original_length - new_length;


    }
}
