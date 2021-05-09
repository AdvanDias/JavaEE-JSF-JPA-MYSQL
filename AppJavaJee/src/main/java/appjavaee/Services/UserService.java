package appjavaee.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserService {

	public void criar(Object x) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplojpadb");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(x);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("USERSERVICE OK");
	}
	
}
