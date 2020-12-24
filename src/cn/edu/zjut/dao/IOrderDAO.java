package cn.edu.zjut.dao;

import java.util.List;

import cn.edu.zjut.po.Order;

public interface IOrderDAO {
	void submit(Order order);
	public List findByHql(String hql);
}
