package lab5_string_loop;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        for(int i = 0; i <= sentence.length()-4; i++){
            String each = sentence.substring(i, i+4);

            if(each.equals("Java")){ //equal (METHODE)creating if statement "conditional statement"
                countJava++; // count java only when is condition true

            }

        }


        System.out.println(countJava);

        System.out.println("------------------------------------------------------------");

        String s = "Cat Cat Cat Dog Dog Dog Dog Dog Dog Dog";

        int countCat = 0;
        int countDog = 0;

        for(int i = 0; i <= s.length()-3; i++){

            String each = s.substring(i, i+3); // creating all possible substring with 3 characters

            if(each.equals("Cat")){ // if the substring is equal to "cat"
                countCat++;
            }

            if(each.equals("Dog")){
                countDog++;
            }

        }


        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);



    }


}





