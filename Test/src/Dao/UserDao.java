package Dao;

import java.util.List;


import org.springframework.orm.hibernate3.HibernateTemplate;

import entity.User;

public class UserDao {
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public boolean findUser(String username,String password){
		String hql="from User as u where u.username='"+username+"' and u.password= '"+password+"'";//字符串要用引号
    	List<User> list=(List)hibernateTemplate.find(hql);
    	if(list.size()>0){
    		return true;
    	}
    	else return false;  
      }
}
