package com.evaluationquesiton2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluationquesiton2.model.Account;

public interface AccountDao extends JpaRepository<Account, Integer>{

}
