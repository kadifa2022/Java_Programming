package day13_returnMethods;




    public class ReturnMethodIntro {


        public static void main(String[] args) {

            // int total = sum(20, 40);  // sum is a void method, does not return any data

            int total =   addition(10, 20);//#1TASK

            int t = square(10);//#2 TASK

            System.out.println(  square(10) );//#2

            System.out.println( cube(5));//#3

            int r = cube(5);//#3


        }

/*
    public static void sum(int n1, int n2){// not possible to return value -VOID METHOD
        int result = n1 + n2;
        System.out.println(result);
    }
*/

        public static int addition(int n1, int n2){ //RETURN METHOD FOR ADDITION #1
            int result = n1 + n2;
            return result;
        }


        public static int square(int num){ //#2
            int square = num * num;
            return square;
        }


        public static int cube(int num){//#3
            int cube = square(num) * num;//= called square methode * num=CUBE num * num * num
            return cube;
        }




    }


