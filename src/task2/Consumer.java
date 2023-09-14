package task2;

import java.util.List;

public class Consumer extends BaseThread {

    public Consumer(List<String> elements, int total, long sleep, int priority) {
        super(elements, total, sleep, priority);

    }


    public void run() {

        for (int count = 0; count < total; ) {

            try {
                //Sem o bloco synchronized abaixo
                // há problema de condição de corrida,
                // mesmo com coleções sincronizadas (thread-safe)
                // synchronized (elements) {
                    if (!elements.isEmpty()) {
                        String element = elements.remove(0);
                        count++;
                        System.out.println("[" + element + "] Removed");
                    }
                //}
                Thread.sleep(sleep);
            } catch (Exception e) {
                System.err.println("ERROR==>" + e.getMessage());
            }
        }
        System.out.println("#Consumer " + Thread.currentThread().getName() + " Finished");

    }
}