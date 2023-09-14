package task1;

import java.util.Arrays;
import java.util.List;

public class Producer extends Thread {
    private List<String> elements;

    public Producer(List<String> elements) {
        this.elements = elements;
        setPriority(Thread.NORM_PRIORITY);
    }

    public void run() {

        for (int i = 0; i < 60; i++) {
            elements.add("E" + i);
            System.out.println("[E" + i + "] Added");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("#Producer Finished");

    }
}