package src.main.java;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Ваша логика здесь
        return 42;
    }
}

