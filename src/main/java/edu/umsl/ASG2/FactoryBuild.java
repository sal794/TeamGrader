package edu.umsl.ASG2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryBuild {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
}
