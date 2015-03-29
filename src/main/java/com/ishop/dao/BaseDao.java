package com.ishop.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by alexkhymenko on 3/29/15.
 */
public interface BaseDao<T>  {
    void init(SessionFactory sessionFactory);

    SessionFactory getSessionFactory();

    Session getSession();

    void delete(T entity);

    T get(Serializable id);

    List<T> list();

    List<T> listOrderedAsc(String propertyName);

    List<T> listOrderedDesc(String propertyName);

    void merge(T entity);

    void refresh(T entity);

    void saveOrUpdate(T entity);

    void save(T entity);

    Collection save(Collection collection);

    void flush();

    void clear();

    List executeListQuery(Query query);

    Object executeUniqueQuery(Query query);

    T executeUniqueCriteria(Criteria criteria);

    T getById(Long id);

    List executeListCriteria(Criteria criteria);
}
