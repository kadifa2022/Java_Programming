package practice;

import java.util.*;

public class GetDup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[in.nextInt()];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

            System.out.println(getDupe(str));

        }
    }


    public static int getDupe(String[] r) {
        int count1 = 0;


        ArrayList<String> list = new ArrayList<>();
        for (String each : r) {
            int count = 0;
            for (String each2 : r) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count > 1) {
                if (!list.contains(each))
                    list.add(each);
            }
        }
        for (String each : list) {

            for (String each1 : r) {
                if (each.equals(each1)) {
                    count1++;
                }
            }

        }
        return count1;


    }

}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array.
getDup(["1","2","aa"',"1"])

returns:2
("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1"])

returns:2
("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","g","aabb',"7","7","2","aa"',"7"])

returns:3
 */