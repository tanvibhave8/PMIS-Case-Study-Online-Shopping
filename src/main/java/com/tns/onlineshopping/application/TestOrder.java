
package com.tns.onlineshopping.application;

import com.tns.onlineshopping.services.OrderService;

public class TestOrder {

    public static void main(String[] args) {

        OrderService service = new OrderService();

        try {
            // Customer 1001's cart madhun order place kara
            service.placeOrder(1001);

            // Customer che orders display kara
            service.viewCustomerOrders(1001);

            // All orders display kara
            service.viewAllOrders();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
