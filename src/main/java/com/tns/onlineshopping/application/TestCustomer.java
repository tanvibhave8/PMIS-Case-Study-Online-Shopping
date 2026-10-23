
package com.tns.onlineshopping.application;

import com.tns.onlineshopping.entities.Customer;
import com.tns.onlineshopping.services.CustomerService;

public class TestCustomer {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();

        try {
            Customer customer = new Customer(
                1001,
                "Aniket",
                "aniket1001@example.com",
                "Nashik"
            );

            service.createCustomer(customer);

            System.out.println("\n--- Customer List ---");

            for (Customer c : service.getCustomers()) {
                System.out.println(
                    "ID: " + c.getUserId()
                    + ", Name: " + c.getUsername()
                    + ", Email: " + c.getEmail()
                    + ", Address: " + c.getAddress()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
