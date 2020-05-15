package br.com.alura;

public class TesteThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
           for (int i =1 ; i< 1001;i++)
               System.out.println("Thread 1: i " + i);
        });
        Thread t2 = new Thread(() -> {
            for (int i =1 ; i< 1001;i++)
                System.out.println("Thread 2: i " + i);
        });
        t.start();
        t2.start();
    }
}
