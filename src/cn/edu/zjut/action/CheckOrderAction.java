package cn.edu.zjut.action;

import java.util.List;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import cn.edu.zjut.po.Order;
import cn.edu.zjut.po.User;
import cn.edu.zjut.service.ICheckOrderService;


public class CheckOrderAction {
	private User loginUser;
	private ICheckOrderService checkorderService = null;
	
	
	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
	public void setCheckorderService( ICheckOrderService checkorderService) {
		this.checkorderService =checkorderService;
	}
	
	private List<Order> orders;
	
	public List<Order> getOrders() {
		return (orders);
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public String execute() {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		loginUser=(User)session.getAttribute("loginUser");
		
		if(checkorderService.CheckOrder(loginUser)!=null)
		{
			//System.out.println("loginUser"+loginUser);
			orders=checkorderService.CheckOrder(loginUser);
			//System.out.println(loginUser.getUsername());
			//request.setAttribute("orders", orders);
			System.out.println(orders);
		return "success";
		}
		else return "fail";
	}
	

}
