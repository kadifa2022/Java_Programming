package day34_abstraction_Interface.animalTask;

public interface Playable {

    boolean isFriendly=true; //static final//by default is public//for private variable use private


   /*
    public static void main(String[] args){

        System.out.println(isFriendly);
        //isFriendly= false;
    }
    default void methode1(){//become static methode

    }

    */

    void play();//abstract methode -first step

}
