package com.evaluationquesiton2.service;

import com.evaluationquesiton2.exception.AccountException;
import com.evaluationquesiton2.exception.InsufficientBalanceException;
import com.evaluationquesiton2.model.Account;
import com.evaluationquesiton2.model.AccountDTO;

public interface AccountService {

	public Account openAccount(Account acc)throws AccountException;
	
	public Account closeAccount(Integer accno)throws AccountException;
	
	public Account depositAmount(Integer accno, Integer amount)throws AccountException;
	
	public Account withdrawAmount(int accno, Integer amount)throws AccountException, InsufficientBalanceException;
	
	public String transferAmount(AccountDTO dto)throws AccountException,InsufficientBalanceException;
}
