package com.masai.dao;

import java.util.List;

import com.masai.dto.AccountTransaction;

public interface AccountTransactionDAO {
	public List<AccountTransaction> findByAccountId(int accountId);

}

