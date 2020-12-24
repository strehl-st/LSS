package cn.edu.zjut.service;

import cn.edu.zjut.po.User;

public interface IUserService {
	public void register(User transientInstance);
	public String login(User transientInstance);
}
