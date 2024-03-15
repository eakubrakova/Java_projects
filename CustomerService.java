package src.main.java;

import java.util.ArrayList;
import java.util.List;

// Класс работы с клиентами
public class CustomerService {
    private List<String> customers = new ArrayList<>();

    public void addCustomer(String customerName) {
        customers.add(customerName);
    }

    public List<String> getCustomers() {
        return customers;
    }
}

