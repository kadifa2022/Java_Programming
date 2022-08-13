package day39_Cloection.multithread;

public class TestMultiThreads {  // class extends Threads is for one class to use
                                // implements Runnable in class for multiple classes

    public static void main(String[] args) {

        ThreadHelloWorld thread1= new ThreadHelloWorld(1);//Multi thread will execute  at the same time
                                                                        // when is Synchronized it is one thread at the time
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3= new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
