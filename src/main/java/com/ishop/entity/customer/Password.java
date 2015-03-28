package com.ishop.entity.customer;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

/**
 * Created by alexkhymenko on 3/28/15.
 */
@Entity
public class Password {

    @Id
    @Column(name="customerId", unique=true, nullable=false)
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="customer"))
    private Long customerId;

    @OneToOne(mappedBy = "password", cascade = CascadeType.ALL)
    private Customer customer;

    public Password(){}

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