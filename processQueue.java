package src.main.java;

import java.util.concurrent.BlockingQueue;

public class processQueue{
    private BlockingQueue<Operation> queue;
    private OperationService operationService;

    private void processQueue() {
        while (true) {
            try {
                Operation operation = queue.poll();
                if (operation == null) {
                    System.out.println("Waiting for next operation in queue");
                    Thread.sleep(1000);
                } else {
                    System.out.println("Processing operation: " + operation);

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
