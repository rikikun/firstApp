package com.thanakorn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thanakorn.DAO.TransactionDAO;
import com.thanakorn.entity.userTransaction;

@Component(value="user_service")
public class UserService {

	@Autowired
	TransactionDAO transac;
	
	public void saveTransaction(userTransaction user_transaction){
		transac.insertTransaction(user_transaction);
	}
	
	public List<userTransaction> showAllTransaction(){
		return transac.selectAllTransaction();
	}

}
