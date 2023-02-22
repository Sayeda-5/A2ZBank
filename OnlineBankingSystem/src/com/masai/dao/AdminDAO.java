package com.masai.dao;


public interface AdminDAO<Admin, Integer> {
	
	public void findByUserIdAndPassword(String userId, String password);

}
