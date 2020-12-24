package cn.edu.zjut.action;
import cn.edu.zjut.po.User;
import cn.edu.zjut.service.IUserService;
public class RegisterAction {
	private User loginUser;
	private IUserService userService = null;

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String execute() {
		userService.register(loginUser);
		return "success";
	}
}