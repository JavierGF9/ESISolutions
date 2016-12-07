package edu.uclm.esi.iso2.multas.dao;

import javax.persistence.Query;

import org.hibernate.HibernateException;

import edu.uclm.esi.iso2.multas.funcionario.Login;

public class LoginDao extends GeneralDao<Login> {

	public LoginDao() {
		super();
	}

	public Login findByUser(String user) throws HibernateException {
		Login usuario = null;

		try {
			startOperation();
			Query query = session.createQuery("user from Login where user=? and");
			query.setParameter(0, user);
			usuario = (Login) query.getSingleResult();
			transaction.commit();
		} catch (HibernateException e) {
			throw e;
		} finally {
			HibernateFactory.close(session);
		}

		return usuario;
	}
}
