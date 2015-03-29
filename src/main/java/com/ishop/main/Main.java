package com.ishop.main;

import com.ishop.dao.customer.CustomerDao;
import com.ishop.entity.customer.Customer;

/**
 * Created by alexkhymenko on 3/28/15.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setUsername("LOOL");
        CustomerDao customerDao = new CustomerDao();
        customerDao.save(customer);
    }
}
