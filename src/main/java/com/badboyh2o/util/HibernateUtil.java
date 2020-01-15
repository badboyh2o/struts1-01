package com.badboyh2o.util;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.badboyh2o.model.Test;
 
public final class HibernateUtil {
    private static SessionFactory sessionFactory;
 
    private HibernateUtil(){
    }
    static{
        Configuration cfg = new Configuration();
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
    }
 
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    
    public static void main(String[] args) {
        System.out.println("1111");
            Session s = HibernateUtil.getSession(); //这里直接调用HibernateUtil工具类中的getSession()方法获得Session
            Transaction tx = s.beginTransaction(); //开启事务
            Query query = s.createQuery("from Test");
            List<Test>   test = query.list();
            System.out.println(test);
    }
}