package day08_selfPractice;

public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 4;
        String result1 ="Invalid Number";

        if(number >= 1 && number <= 5){
            result1 = (number == 1) ? "Hello, Thanks for your call"
                    :(number == 2) ? " Hola, Gracias pare llmar"
                    :(number == 3)? " Merhaba, aradiginez icin tesekkuler"
                    :(number == 4) ? " Privet, spasibo za vash zvonok"
                    :"Merci, pour votre appel";



        }
        System.out.println(result1);


        System.out.println("-------------------------------");

        String result2 = "Invalid Number ";

        switch (number){
            case 1:
                result2 = "Hello, tanks for you call";
                break;
            case 2:
                result2 = "Hola, gracias para llmar";
                break;
            case 3:
                result2 = "Merhaba, aradignis icin tesekkiler";
                        break;
            case 4:
                result2 = " Privet, spasibo za vash zvonok";
                break;
            case 5:
                result2 = " Merci, pour votre appel";


        }








    }
}

/*Create a class called ChooseLanguage,
Given an integer variable named selection that has a number between 1~5.
Write a
Solution 1: Solution 2:
program that can select the language based on the number that's given in selection and prints the follo
for for for for for
for
1: Hello, thanks for your call
2: Hola, gracias para llamar
3: Merhaba, aradiginiz icin tesekkurler 4: Privet, spasibo za vash zvonok
5: Merci ,pour votre appel
any other numbers print "Invalid Number"
Must use ternary
MUST use switch statement

 */