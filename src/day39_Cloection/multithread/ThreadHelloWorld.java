package day39_Cloection.multithread;

public class ThreadHelloWorld extends Thread{//if we don't extend the class to another class  we can create  Thread class

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {//we have to override run() methode
        for (int i = 1; i < 6; i++) {
            System.out.println( " Hello world " + i + " from Thread " + threadNumber);
            try {                            //this time we have to use try and catch
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
