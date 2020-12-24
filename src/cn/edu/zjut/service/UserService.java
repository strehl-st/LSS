package cn.edu.zjut.service;

import java.util.List;

import cn.edu.zjut.dao.IUserDAO;
import cn.edu.zjut.po.User;

public class UserService implements IUserService {
	private IUserDAO userDAO = null;
	
	public UserService(){
		System.out.println("create UserService.");
	}
	
	public void setUserDAO(IUserDAO userDAO) {
		System.out.println("--setCustomerDAO--");
		this.userDAO = userDAO;
	}
	
	public void register(User transientInstance) {
		System.out.println("execute --register()-- method.");
		userDAO.save(transientInstance);
	}

	public String login(User loginUser) {
		System.out.println("execute --login()-- method.");
		String account = loginUser.getUsername();
		String password = loginUser.getPassword();
		String hql = "from User as uu where username='"+account+ "' and password='" + password +"'";
		List list = userDAO.findByHql(hql);
		User user=(User)list.get(0);
		if(list.isEmpty())
			return "fail";
		else if(user.getRole().equals("管理员")){
			return "admin";
		}
		else return "success";
		
	}
}
