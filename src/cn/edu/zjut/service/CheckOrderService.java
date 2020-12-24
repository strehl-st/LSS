package cn.edu.zjut.service;

import java.util.List;

import cn.edu.zjut.dao.IOrderDAO;
import cn.edu.zjut.dao.IRetailerDAO;
import cn.edu.zjut.dao.IUserDAO;
import cn.edu.zjut.po.Retailer;
import cn.edu.zjut.po.User;

public class CheckOrderService implements ICheckOrderService {
      private IUserDAO userDAO = null;
      private IOrderDAO orderDAO = null;
      private IRetailerDAO retailerDAO = null;
      
	
	public CheckOrderService(){
		System.out.println("create UserService.");
	}
	
	public void setUserDAO(IUserDAO userDAO) {
		System.out.println("--setCustomerDAO--");
		this.userDAO = userDAO;
	}
	public void setOrderDAO(IOrderDAO orderDAO) {
		System.out.println("--setOrderDAO--");
		this.orderDAO = orderDAO;
	}
	
	public void setRetailerDAO(IRetailerDAO retailerDAO) {
		System.out.println("--setRetailerDAO--");
		this.retailerDAO = retailerDAO;
	}

	public List CheckOrder(User loginUser) {
		System.out.println("execute --checkorder()-- method.");
		//String username = loginUser.getUsername();
		//String hql = "from Order as uu where retailer_id="+username;
//		String hql = "from Order";
//		List list = orderDAO.findByHql(hql);
//		return list;
		String username = loginUser.getUsername();
		String password = loginUser.getPassword();
		String hql = "from User as uu where username='"+username+ "' and password='" + password +"'";
		List list = userDAO.findByHql(hql);
		User user=(User)list.get(0);
		int uid=user.getUser_id();
		System.out.println(uid);
		String s1="from Retailer as rr where user_id='"+uid+"'";
		System.out.println(s1);
		List list1=retailerDAO.findByHql(s1);
		System.out.println(list1);
		
		Retailer retailer=(Retailer)list1.get(0);
		
		System.out.println(retailer.getRetailer_id());
		String s2 = "from Order as uu where retailer_id='"+retailer.getRetailer_id()+"'";
		
		List list2 = orderDAO.findByHql(s2);
		System.out.println(list);
		return list2;
	}
}
