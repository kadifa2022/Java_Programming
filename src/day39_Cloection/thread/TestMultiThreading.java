package day39_Cloection.thread;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWord thread1 = new ThreadHelloWord(1);
        ThreadHelloWord thread2 = new ThreadHelloWord(2);
        ThreadHelloWord thread3 = new ThreadHelloWord(3);
        ThreadHelloWord thread4 = new ThreadHelloWord(4);
        ThreadHelloWord thread5 = new ThreadHelloWord(5);


/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
 */

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }


}