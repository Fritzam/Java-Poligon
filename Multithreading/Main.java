package Multithreading;

class Main {

    //Dwie metody tworzenia threada:
        //1: Stworzenie podklasy dziedziczącej Thread
        //2: Stworzenie podklasy implementującej interfejs Runnable i podanie
            //Tej klasy jako argumentu do konstruktora klasy Thread.
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();
        //thread1.join(); // Calling thread(ex.main) wait until the specified thread dies, or for x amount of milliseconds.
        thread2.start();

        System.out.println(1/0);




    }
}
