package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
public class Main {
    public static void main(String[] args) throws InterruptedException {

// Sem problema
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

// Com problema
       // List<String> list = new ArrayList<String>();

        Producer p = new Producer(list);
        Consumer c = new Consumer(list);

        p.start();
        c.start();

        p.join();
        c.join();

        System.out.println("Final List=>"+list.toString());

     }
}