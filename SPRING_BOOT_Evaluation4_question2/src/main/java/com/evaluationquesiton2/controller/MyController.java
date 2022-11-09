package com.evaluationquesiton2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluationquesiton2.exception.AccountException;
import com.evaluationquesiton2.exception.InsufficientBalanceException;
import com.evaluationquesiton2.model.Account;
import com.evaluationquesiton2.model.AccountDTO;
import com.evaluationquesiton2.service.AccountService;

@RequestMapping("Acc")
@RestController
public class MyController {

	@Autowired
	private AccountService accd;

	@PostMapping("/account")
	public Account openAccountHandler(@RequestBody Account acc)throws AccountException{
		
		return  accd.openAccount(acc);
	}
	
	@DeleteMapping("/account/{accno}")
	public Account closeAccountHandler(@PathVariable Integer accno)throws AccountException{
		
		return accd.closeAccount(accno);
	}
	
	@PutMapping("/dep/{accno}/{amount}")
	public Account depositAmountHandler(@PathVariable Integer accno,@PathVariable Integer amount)throws
	AccountException{
		
		return accd.depositAmount(accno, amount);
		
	}

	@PutMapping("/with/{accno}/{amount}")
	public Account withdrawAmmountHandler(int accno, Integer amount)throws
	AccountException, InsufficientBalanceException{
		
		return accd.withdrawAmount(accno, amount);
		
	}
	
	@PostMapping("/acctdto")
	public String transferAmountHandler(@RequestBody  AccountDTO dto)throws AccountException,
	InsufficientBalanceException{
		return accd.transferAmount(dto);
	}
}
