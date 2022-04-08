package vn.daotq.interviewapp.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;

public class CategoriesRepository {
    @PersistenceUnit
    private EntityManagerFactory emf;
  
    protected SessionFactory getSessionFactory() {
      return emf.unwrap(SessionFactory.class);
    }
}
