package day21_multiDimensionalArray;

import day20_forEach.ForEachLoop;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

  /*  public static void main(String[] args) {

        String[] group1 = {"James", "Daniel","Vahida","Husein"};  // 4 names
        String[] group2 = {"Kadifa","Katarina","Dzeneta"};  // 3 names
        String[] group3 = {"Bajrama", "Asima","Asim","Nijaz"," Imran"};  // 5 names
        String[] group4 = {"Mehmed","Adis"};  // 2 names
        // index of :elements    0        1         2        3          0           1         2            0         1       2       3       4           0        1
        String[][] groups =  {{"James", "Daniel","Vahida","Husein"}, {"Kadifa","Katarina","Dzeneta"}, {"Bajrama", "Asima","Asim","Nijaz"," Imran"}, {"Mehmed","Adis"}};
         // index of Array:    0                                     1                                       2                                 3
      //   1-group
        for (int i = 0; i < groups.length; i++) {//for loop
           String[] eachGroup =groups[i];
            System.out.println(Arrays.toString(eachGroup));

            //names each student
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachGroup);

            }



        }

        System.out.println("----------------------------------------------------");
//for each loop -beginning to the end

    }


}
*/  public static void main(String[] args) {

      String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
      String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
      String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
      String[] group4 = {"Adelina", "Ali"}; //2 names;


      String[][] groups = {group1, group2, group3, group4};
      //                      0        1       2       3

      for (int i = 0; i < groups.length; i++) {
          String[] eachGroup = groups[i];
          System.out.println(Arrays.toString(eachGroup));

          for (int j = 0; j < eachGroup.length; j++) {
              String eachStudent = eachGroup[j];
              System.out.println(eachStudent);
          }

      }


      System.out.println("-----------------------------------------------------------");

      for (String[] eachGroup : groups) {
          System.out.println(Arrays.toString(eachGroup) );
          for (String eachStudent : eachGroup) {
              System.out.println(eachStudent);
          }
      }


      System.out.println("-----------------------------------------------------------");

      for (int i = groups.length - 1; i >= 0; i--) {

          String[] eachGroup = groups[i];
          System.out.println(Arrays.toString(eachGroup));

          for (String eachStudent : eachGroup) {
              System.out.println(eachStudent);
          }

      }


      System.out.println("-----------------------------------------------------------");

      System.out.println(groups);

      System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

      System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY




  }


}

