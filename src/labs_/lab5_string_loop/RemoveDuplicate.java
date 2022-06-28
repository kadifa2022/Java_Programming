package labs_.lab5_string_loop; //interview

public class RemoveDuplicate { //create loop

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            //result.indexOf(each) < 0 //removing duplicates
            if(!result.contains(""+each)) { // before adding the character to new string, we check if the character is not included in the new string
                result += each;
            }

        }


        System.out.println(result);



    }

}

