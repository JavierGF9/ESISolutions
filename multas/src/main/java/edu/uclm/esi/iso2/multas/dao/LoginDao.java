package edu.uclm.esi.iso2.multas.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.uclm.esi.iso2.multas.funcionario.Login;

import javax.persistence.Query;


public class LoginDao {
	
	protected Session session;
	protected Transaction transaction;

	protected void startOperation() throws HibernateException {
        session = HibernateFactory.openSession();
        transaction = session.beginTransaction();
    }
	
	public String findByUser(String user) throws HibernateException {
		String usuario = null;
        try {
            startOperation();
            Query query=session.createQuery("select user from Login where user=\"" + user + "\";");
            query.setParameter(1, usuario);
            usuario = (String) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return usuario;
	}
	
	public String findByPass(String pass) throws HibernateException {
		String contrasena = null;
        try {
            startOperation();
            Query query=session.createQuery("pass from Login where pass=? and ");
            query.setParameter(1, pass);
            contrasena = (String) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return contrasena;
	}
	
	
}
