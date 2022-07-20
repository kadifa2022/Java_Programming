package practice;

public class camelCasing {




        public static String camelCase (String str) {  //

            String result = "";

            for (char each : str.toCharArray()) {
                if (each != Character.toUpperCase(each)) {
                    result += each;
                } else if (each == Character.toUpperCase(each)) {
                    result += " " + Character.toUpperCase(each);
                } else {
                    result += str;

                }
            }
                return result.trim();





        }}