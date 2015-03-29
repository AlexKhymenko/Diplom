package com.ishop.dao.customer;

import com.ishop.entity.customer.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by alexkhymenko on 3/29/15.
 */
@Repository
public class CustomerDao {
    @Autowired
    SessionFactory sessionFactory;

    public void save(Customer customer) {
        sessionFactory.getCurrentSession();
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(customer);
        tx.commit();
        session.close();
    }
}
