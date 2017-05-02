 package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

public class UserAction extends ActionSupport{
     private UserService userService;
     
     public void setUserService(UserService userService) {
		this.userService = userService;
     }
     
     private String username;
     private String password;
     
     public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() throws Exception{
    	if(userService.checkUser(username,password)){
		  return "success";
    	}
    	else return "error";
     }
} 
