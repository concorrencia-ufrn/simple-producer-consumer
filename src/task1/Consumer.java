package task1;

import java.util.Arrays;
import java.util.List;

public class Consumer extends Thread {

public Consumer(List<String> elements){
    this.elements = elements;
    setPriority(Thread.MIN_PRIORITY);

}
    private List<String> elements;

    public void run(){

        for (int count = 0; count < 60; ) {

            if(!elements.isEmpty()) {
                String element = elements.remove(0);
                count++;
                System.out.println("[" + element + "] Removed");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("#Consumer Finished");
    }
}