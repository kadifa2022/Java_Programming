package practice;

public class duplicateCounterMentorClass {
    public static void main(String[] args) {


    }public static int duplicateCounter(String name) {
        int count = 0;
        String example = "";
        for (int i = 0; i < name.length(); i++) { //r
            char ch = name.charAt(i);
            count = 0;
            for (int j = 0; j < name.length(); j++) { //

                if (ch == name.charAt(j)) {
                    count++;
                }


            }
            if (count > 1 && (!example.contains(ch + ""))) {
                example += "" + ch;
            }
        }
        return example.length();



    }
}