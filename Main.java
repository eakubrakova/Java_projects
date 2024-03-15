package src.main.java;
import java.util.List;


// Пример использования класса StorageService
public class Main{
    public static void main(String[] args) {
        StorageService<String> storageService = new StorageService<>();
        storageService.storeData("Пример данных");

        List<String> storedData = storageService.getData();
        for (String data : storedData) {
            System.out.println(data);
        }
    }
}







