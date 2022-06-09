package day16_selfPractice;


public class FrequencyOfCharacters1 {
    public static void main(String[] args) {


        String str = "AAABBCCCCDDDD";
        String result = "";

        for (int j = 0; j < str.length() ; j++) {
            char ch = str.charAt(j);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) ==ch){
                    count++;
                }

            }
            if(!result.contains(""+ ch)){
                result += ch + "" + count;
            }
        }
    }
}
