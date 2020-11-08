package pack1;

import com.sun.xml.internal.stream.events.DummyEvent;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Thread.currentThread().setName("My Thread");
        System.out.println(Thread.currentThread().getName());
        MyThread[] arr= new MyThread[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = new MyThread();
            arr[i].setName(Integer.toString(i));
            arr[i].start();
        }
        for (int i = 0; i < 10; i++)
        {
            try {
                arr[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*
        Carte c = new Carte("tom sawyer", "momo", 1234, 2);
        System.out.println(c.toString());
        Biblioteca b= new Biblioteca();
b.add(new Carte("Carte","autor",2000,12200));
b.add(c);
b.sort();
        System.out.println(b.toString());

        OutTask tsk1=new OutTask();
        tsk1.execute();
        RandomOutTask tsk2= new RandomOutTask();
        tsk2.execute();

         */

    }
}
