package com.ishop.entity.customer;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

/**
 * Created by alexkhymenko on 3/28/15.
 */
public class Address {

    @Id
    @Column(name="customer_id", unique=true, nullable=false)
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="customer"))
    private Long customerId;

    private String address;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Customer customer;

    public Address() {}

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
