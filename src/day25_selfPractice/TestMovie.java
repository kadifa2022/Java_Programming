package day25_selfPractice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class TestMovie {


    public static void main(String[] args) {

        Movie mov1 = new Movie("USA","Java developer: Zero to Hero","Comedy","Kuzzat Altay",
                LocalDate.of( 2021, 4, 18));


        mov1.casts = new ArrayList<>(Arrays.asList("Ozzy", "Muhtar"));
        mov1.addCast("Lorraine");
        String[] addToCast = {"Mira","Minka","Tina","Josipa"};
        mov1.addCasts(addToCast);
        System.out.println(mov1);

    }
}
