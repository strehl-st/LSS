package cn.edu.zjut.dao;

import java.util.List;

import cn.edu.zjut.po.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDAO extends BaseHibernateDAO implements IUserDAO {
	
	public void save(User transientInstance) {
		Transaction tran = null;
		Session session = null;
		
		try {
			session = getSession();
			tran = session.beginTransaction();
			session.save(transientInstance);
			tran.commit();
		} catch (RuntimeException re) {
		if(tran != null) tran.rollback();
			throw re;
		} finally {
			session.close();
		}
	}
	public List findByHql(String hql) {
		//log.debug("finding LoginUser instance by hql");
		//SessionFactory sf= new Configuration().configure().buildSessionFactory();
		//Session session=sf.openSession();
		Transaction tran = null;
		Session session = null;
		try {
			session = getSession();
			tran = session.beginTransaction();
		String queryString = hql;
		Query queryObject = session.createQuery(queryString);
		return queryObject.list();
		} catch (RuntimeException re) {
		//log.error("find by hql failed", re);
		throw re;
			//System.out.println("RuntimeException re");
		} finally{
			session.close();
		}
	}
}