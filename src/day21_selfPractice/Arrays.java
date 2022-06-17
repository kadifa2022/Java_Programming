package day21_selfPractice;

public class Arrays {
    public static void main(String[] args) {
       // index element:            0        1          2       3         4
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        // elem.Index                        0         1         2         3        4        5       6
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        //elem.index               0          1           2       3        4         5
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};
        // Array Index:              0            1            2
        String[][]batch1Groups={batch1Group1,batch1Group2,batch1Group3};
        //elem.index               0        1        2         3       4
        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        //elem.index:               0        1        2         3
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        //elem.Index                0        1         2         3        4       5         6
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        //Array Index:              0             1           2
        String[][]batch2Groups={batch2Group1,batch2Group2,batch2Group3};//
        //-1Array
        String [][][] CydeoStudents={{batch1Group1,batch1Group2,batch1Group3},{batch2Group1,batch2Group2,batch2Group3}};
        for(String [][] batches: CydeoStudents){//-1Array
            for(String [] eachBatch:batches){//-1Array
                for(String eachName: eachBatch){//-1Array=eachName
                    System.out.println(eachName);
                }
            }
        }
;






    }
}
//note each batchGroup has a []and then, count each group -1[]- -create String [][][] CydeoStudents and add groupBatches - create for loop with two[][]-than another
// loop -1 [] on the end eachName.
/*
1. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students
 */