package Controllers;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Controller {

    protected SessionFactory sessionFactory;
    protected Session session;

    protected Class annotatedClass;
    protected Class otherClass;

    Controller(Class annotatedClass) {
        this.annotatedClass = annotatedClass;
    }

    Controller(Class annotatedClass, Class otherAnotatedClass) {
        this.annotatedClass = annotatedClass;
        this.otherClass = otherAnotatedClass;

    }

    protected void openSession() {
        if (otherClass == null) {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(annotatedClass).buildSessionFactory();

        } else {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(annotatedClass).addAnnotatedClass(otherClass).buildSessionFactory();
        }
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    protected void closeSession() {
        // sessionFactory.close();
    }

    protected <T> List<T> getAll(Class<T> tipo) {
        this.openSession();
        System.out.println("Controllers.Controller.getAll()" + tipo.getSimpleName());
        return session.createQuery("FROM " + tipo.getSimpleName(), tipo).getResultList();
    }

}
