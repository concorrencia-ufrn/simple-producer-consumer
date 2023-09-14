package task2;

import java.util.List;

public class Producer extends BaseThread {

    public Producer(List<String> elements, int total, long sleep, int priority) {
        super(elements, total, sleep, priority);

    }

    public void run() {
        try {

            for (int i = 0; i < total; i++) {

                elements.add("E" + i);

                System.out.println("[E" + i + "] Added");
                Thread.sleep(sleep);
            }
        } catch (InterruptedException e) {
            System.err.println("ERROR==>" + e.getMessage());
        }

        System.out.println("# Producer " + Thread.currentThread().getName() + " Finished");

    }
}