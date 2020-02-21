package com.dbConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.entity.Activity;
import com.entity.Apnee;
import com.entity.Golf;
import com.entity.Jogging;
import com.entity.Muscu;
import com.entity.Natation;
import com.entity.TirArc;
import com.entity.User;

public class DBConnection {
	private static SessionFactory sessionFactory;
	private static AnnotationConfiguration config;

	public static AnnotationConfiguration getConfig() {
		if (config == null) {
			config = new AnnotationConfiguration();
			config.addAnnotatedClass(Activity.class);
			config.addAnnotatedClass(Apnee.class);
			config.addAnnotatedClass(Golf.class);
			config.addAnnotatedClass(Jogging.class);
			config.addAnnotatedClass(Muscu.class);
			config.addAnnotatedClass(Natation.class);
			config.addAnnotatedClass(TirArc.class);
			config.addAnnotatedClass(User.class);
			config.configure("com/core/connection.cfg.xml");
		}
		return config;
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				AnnotationConfiguration config = getConfig();
				sessionFactory = config.buildSessionFactory();
			} catch (Throwable ex) {
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		return sessionFactory;
	}

	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}