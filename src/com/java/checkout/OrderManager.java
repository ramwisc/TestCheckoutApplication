package com.java.checkout;

import java.util.Date;

public class OrderManager {

    public static void main(String[] args) {
        String customerID = "123ABC";
        placeOrder(customerID, System.currentTimeMillis());
    }

    private static void placeOrder(String customerID, long currentTimeMillis) {
        final CustomerInfo ci = getCustomerInfo(customerID);
        if (ci != null) {
            storeDBOrderRecord(ci);
            sendNotification(ci);
        }

    }

    private static boolean sendNotification(CustomerInfo ci) {
        double coinflip = Math.random();
        return coinflip >= 0.5? true: false;
    }

    private static String storeDBOrderRecord(CustomerInfo ci) {
        // store and return new order id
        return "order123";
    }

    private static CustomerInfo getCustomerInfo(String customerID) {
        return new CustomerInfo("test-customer", "123 3rd ave, Seattle, 99109",
                new Date(), "test-customer@gmail.com");
    }

}
