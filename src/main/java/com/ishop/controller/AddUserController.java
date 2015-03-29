package com.ishop.controller;

import com.ishop.dao.customer.CustomerDao;
import com.ishop.entity.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alexkhymenko on 3/29/15.
 */
@Controller
public class AddUserController {

    @Autowired
    CustomerDao customerDao;

    @ResponseBody
    @RequestMapping(value = "sleep", method = RequestMethod.POST)
    public void addUser(@RequestParam(value="user") Customer customer) {
        customerDao.save(customer);
    }

}
