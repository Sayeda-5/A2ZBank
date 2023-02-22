package com.masai.dao;

import com.masai.dto.Account;

public interface AccountDAO {
	public void findByCustomerId(int customerId);
	public void findByCardNo(String cardNo);
	public void save(Account account);
	public Object findById(int accountId);
}
