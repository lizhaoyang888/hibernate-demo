package com.example.dao;

import com.example.po.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public UserDao(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    public void close(){
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public void add(int id,String name){
        UserEntity user = new UserEntity(id,name);
        session.save(user);
    }

}
