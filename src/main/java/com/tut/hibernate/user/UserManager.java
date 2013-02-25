
// BSD License. Created by jano@jano.com.es

package com.tut.hibernate.user;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tut.hibernate.util.HibernateUtil;

/**
 * UserManager
 */
public class UserManager {

    public Long create(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Long courseId = null;
        try {
            transaction = session.beginTransaction();
            User user = new User();
            user.setName(name);
            courseId = (Long) session.save(user);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return courseId;
    }


    @SuppressWarnings("unchecked")
    public List<User> read() {
        List<User> users = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            users = session.createQuery("from User").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return users;
    }
    
    public void update(Long courseId, String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User user = (User) session.get(User.class, courseId);
            user.setName(name);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    public void delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User user = (User) session.get(User.class, id);
            session.delete(user);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}