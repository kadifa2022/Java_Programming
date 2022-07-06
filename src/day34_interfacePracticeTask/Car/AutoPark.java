package day34_interfacePracticeTask.Car;

interface AutoPark {
    boolean hasAutoPark = true;

    default boolean getAutoPark(){
        return hasAutoPark;
    }
    void autoPark();

}
