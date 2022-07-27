package day_InterviewQuestions.mentorsInterviewQuestions;

public class getFirstNonRepeatingVowel {
    public static int getFirstNonRepeatingVowel(String input) {


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'u' || ch == 'o' || ch == 'e' || ch == 'i') {
                int vowelCount = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;

                    }
                }
                if (vowelCount == 1) {
                    return i;
                }
            }

        }
        return -1;

    }
}