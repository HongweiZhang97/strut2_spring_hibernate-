package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Dao.UserDao;
public class UserService {
	 private UserDao userDao;
	 
     public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean checkUser(String username,String password){
    	 if(userDao.findUser(username, password)){
    		 return true; 
    	 }else return false;
     }
}
