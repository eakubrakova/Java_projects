package src.main.java;

import java.util.ArrayList;
import java.util.List;

// Класс работы с хранением данных
public class StorageService<T> {
    private final List<T> data = new ArrayList<>();

    public void storeData(T item) {
        data.add(item);
    }

    public List<T> getData() {
        return data;
    }
}