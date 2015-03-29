package com.ishop.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by alexkhymenko on 3/29/15.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    //@Resource(name = "sessionFactory")
    public void init(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public Session getSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public T get(Serializable id) {
        return null;
    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public List<T> listOrderedAsc(String propertyName) {
        return null;
    }

    @Override
    public List<T> listOrderedDesc(String propertyName) {
        return null;
    }

    @Override
    public void merge(T entity) {

    }

    @Override
    public void refresh(T entity) {

    }

    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
        getSession().flush();
    }

    @Override
    public void save(T entity) {

    }

    @Override
    public Collection save(Collection collection) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public void clear() {

    }

    @Override
    public List executeListQuery(Query query) {
        return null;
    }

    @Override
    public Object executeUniqueQuery(Query query) {
        return null;
    }

    @Override
    public T executeUniqueCriteria(Criteria criteria) {
        return null;
    }

    @Override
    public T getById(Long id) {
        return null;
    }

    @Override
    public List executeListCriteria(Criteria criteria) {
        return null;
    }
}
