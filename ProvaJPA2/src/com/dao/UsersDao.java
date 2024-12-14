package com.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.model.Users;

public class UsersDao {

	EntityManagerFactory emf ;
	EntityManager em;
	
	public UsersDao() {
		 emf = Persistence.createEntityManagerFactory("Hib4PU");
		 em = emf.createEntityManager();

	}
	
	public void insert(Users u) {
		em.getTransaction().begin();
		
		em.persist(u);

		em.getTransaction().commit();

	}
	
	public void update(Users u) {
		em.getTransaction().begin();
		
		em.merge(u);

		em.getTransaction().commit();

	}
	public void delete(int id) {
		em.getTransaction().begin();
		
		Users u = em.find(Users.class, id);
		em.remove(u);
		
		em.getTransaction().commit();

	}
	
	public Users getById(int id) {
		
		Users t = em.find(Users.class, id);
		return t;
	}
}
