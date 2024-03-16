package src.main.java;

public void startAsyncOperationProcessing() {
    Thread t = new Thread() {
        @Override
        public void run() {
            processQueue();
        }
    };
    t.start();
}