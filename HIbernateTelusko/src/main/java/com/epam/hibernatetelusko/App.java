package com.epam.hibernatetelusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {

    Alien alien = new Alien();
    alien.setaId(1111);
    alien.setaName(new AlienName("Prabhudeep", "Singh", "Banga"));
    alien.setaColor("Green");
    
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    try (Session session = sessionFactory.openSession()) {

      Transaction transaction = session.beginTransaction();
      session.save(alien);
      transaction.commit();
    }

  }
}
