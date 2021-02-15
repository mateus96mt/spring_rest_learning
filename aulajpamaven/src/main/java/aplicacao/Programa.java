package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(null, "Mateus", "mateus@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria", "maria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Julia", "julia@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Pronto!");
	}

}
