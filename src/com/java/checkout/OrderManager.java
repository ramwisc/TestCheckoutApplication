package com.java.checkout;

import java.util.Date;

public class OrderManager {

    class EmailInfo {
        public String primaryEmail;
        public String secondaryEmail;
        public EmailInfo(String primaryEmail, String secondaryEmail) {
            super();
            this.primaryEmail = primaryEmail;
            this.secondaryEmail = secondaryEmail;
        }
    }
    
    public void placeOrder(String customerID, long currentTimeMillis,
            String itemID) {
        final CustomerInfo ci = getCustomerInfo(customerID);
        if (ci != null) {
            storeDBOrderRecord(ci);
            sendNotification(ci);
        }

    }

    private boolean sendNotification(CustomerInfo ci) {
        EmailInfo email = getEmail(ci);
        if (email.primaryEmail != null) {
            return true; // send email
        }
        return false;
     }

    private EmailInfo getEmail(CustomerInfo ci) {
        return new EmailInfo(null, "test@gmail.com");
    }

    private String storeDBOrderRecord(CustomerInfo ci) {
        // store and return new order id
        return "order123";
    }

    private CustomerInfo getCustomerInfo(String customerID) {
        return new CustomerInfo("test-customer", "123 3rd ave, Seattle, 99109",
                new Date());
    }

}
