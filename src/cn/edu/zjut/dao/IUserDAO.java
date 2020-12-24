package cn.edu.zjut.dao;

import java.util.List;

import cn.edu.zjut.po.User;

public interface IUserDAO {
	public void save(User transientInstance);
	public List findByHql(String hql);
}
