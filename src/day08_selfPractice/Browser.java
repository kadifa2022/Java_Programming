package day08_selfPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.CopyOnWriteArraySet;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Chrome";
        String result = "";

        switch (browserName){

            case "CHROME":
            case "chrome":
                result = "Chrome is opening";
                        break;
            case "FIREFOX":
            case " firefox":
                result = " Firefox is opening";
                break;
            case "opera":
                result = " Opera is opening";
                break;
            case " safari":
                result = "Safari is opening";
                break;
            case "Internet Explorer":
                result= " Internet Explorer is opening";
                break;
            default:
                result = browserName + " is not valid";


        }

        System.out.println(result);


    }
}
   /* write a program that can display the selected browser
        40 3.1 declare a String variable called browserName
        41 3.2 Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        42 3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
        43 Do Not use if statement or ternary
    */
