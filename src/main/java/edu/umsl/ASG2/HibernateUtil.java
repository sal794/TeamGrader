package edu.umsl.ASG2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory factory;
	
	
	public static SessionFactory buildSessionFactory(){
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		factory = new Configuration().configure().buildSessionFactory(serviceRegistry);

		return factory;
	}
	
	
	
	
	
//	private static SessionFactory buildSessionFactory(){
//		return new Configuration().configure().buildSessionFactory();
//	}
//	public static SessionFactory getSessionFactory(){
//		return sessionFactory;
//	}
//	public static void shutdown(){
//		getSessionFactory().close();
//	}
	
}
