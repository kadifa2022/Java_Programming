package day27_SelfPractice;

public class TestIphoneObject {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("MaxPro11","60GB","Silver", 999,"China");

        System.out.println(iphone1);

        System.out.println("Call number: " + iphone1.call(3146005363l));
        System.out.println("Text number: " + iphone1.text(3126005363l));
        System.out.println("Face Time: " + iphone1.faceTime(3146005363l));
        System.out.println("Face time email: " + iphone1.faceTime("kadifakudic@yahoo.com"));
    }
}
