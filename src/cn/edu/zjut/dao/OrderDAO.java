package cn.edu.zjut.dao;

import cn.edu.zjut.po.Order;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OrderDAO extends BaseHibernateDAO implements IOrderDAO{
    public void submit(Order transientInstance) {
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
		Transaction tran = null;
		Session session = null;
		try {
			session = getSession();
			tran = session.beginTransaction();
		String queryString = hql;
		Query queryObject = session.createQuery(queryString);
		return queryObject.list();
		} catch (RuntimeException re) {
		throw re;
		} finally{
			session.close();
		}
	}
}
