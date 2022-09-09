package day42_maps.selfPractice;





public class CamelCasing {

    public static String camelCasing(String str) {
        String output="";
        String input= "";
        for(char ch:input.toCharArray()){
          output=Character.isUpperCase(ch)? output+""+ch:output +ch;

      }

        return output.trim();

    }

   }