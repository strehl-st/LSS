package cn.edu.zjut.action;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.edu.zjut.po.User;
import cn.edu.zjut.service.IUserService;

public class LoginAction {
    private User loginUser;
    private IUserService userService = null;
    //省略 loginUser 的 getters/setters 方法
    
    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String execute() {
    	if (userService.login(loginUser)=="success") 
    	{
    		HttpServletRequest request=(HttpServletRequest) ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			session.setAttribute("loginUser",loginUser);
    		return "success";
    		
    	}
        else if(userService.login(loginUser)=="admin") return "admin";
        else return "fail";
    }
}
