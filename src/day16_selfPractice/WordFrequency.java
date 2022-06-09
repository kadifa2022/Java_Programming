package day16_selfPractice;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "My favorite programing language is JAva. I Love jAvA. JaVa is cool";
        sentence = sentence.toLowerCase();
        String word = "java" ;
        int counter = 0;

        while (sentence.contains(word)){
            counter++;
            sentence= sentence.replaceFirst("java", "");

        }

        System.out.println(word + " has repeated: " + counter + " times.");

    }
}
