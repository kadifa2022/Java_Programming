package practice.numberTask;

public class Number_BinaryRepresentationOfN {
    /*
    return the number of '1's in the binary representation of n for any integer n, where n > 0
    Example:
    for n=6 the binary representation is '110' and the number of '1's in that representation is 2
    */
    public static int getCountOfOnce(int n){
        String s ="";
        boolean results = n > 0;
        while (results){
            s =((n%2) == 0 ? "0": "1") + s;
            n=n/2;
            results = n >0;

        }
        int count = 0;
        for (char each:s.toCharArray()) {
            if (each =='1');
            count++;
            
        }
        return count;
    }

    public static void main(String[] args) {
       String  myArray [] ={ "lina", "tims", "sara", "milka"};
        System.out.println(getCountOfOnce(110));

    }
}
