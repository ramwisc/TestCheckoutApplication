package com.java.checkout;

import java.util.Date;

public class CustomerInfo {
    public String customerName;
    public String address;
    public Date startDate;

    public CustomerInfo(String customerName, String address, Date startDate) {
        this.customerName = customerName;
        this.address = address;
        this.startDate = startDate;
    }
}
