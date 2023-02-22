package com.masai.dao;

import java.util.List;

import com.masai.dto.AccountTransaction;

public interface AccountTransactionDAO {
	public List<AccountTransaction> findByAccountId(int accountId);

//	@Query(value = "select a from AccountTransaction a where a.accountId =:accountId and a.date=:date")
//	AccountTransaction List<AccountTransaction> findByAccountIdAndDate("("accountId") int accountId, ("date") String date");
}

