package day14_selfPractice;

public class SumOfDigitString {

    public static void main(String[] args) {

        String input = "A1B2C3";
        char c;
        int sum=0;
        int a=0;

        for (int i = 0; i < input.length(); i++) {
            c=input.charAt(i);

            if (c>=48 && c<=57){
                int b = c;

                switch (b){
                    case 49:
                    a=1;
                       break;
                    case 50:
                        a=2;
                        break;
                    case 51:
                        a=3;
                        break;
                    case 52:
                        a=4;
                        break;
                    case 53:
                        a=5;
                        break;
                    case 54:
                        a=6;
                        break;
                    case 55:
                        a=7;
                        break;
                    case 56:
                        a=8;
                        break;
                        case 57:
                            a=9;
                            break;
                }
                sum = sum +a;
            }


        }

        System.out.println(sum);






    }




}
/*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1


 */