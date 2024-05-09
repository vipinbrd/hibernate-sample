package com.vipin.utilty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
	
	
	private static EntityManagerFactory emf;
	
	
	
	static {
		emf=Persistence.createEntityManagerFactory("accountUnit");
	}
	
	
	public static EntityManager getmanager() {
		return emf.createEntityManager();
	}

}
