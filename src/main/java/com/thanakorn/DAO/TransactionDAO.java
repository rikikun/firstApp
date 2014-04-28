package com.thanakorn.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.thanakorn.entity.userTransaction;

@Component(value = "txDAO")
public class TransactionDAO {
	@Autowired
	HibernateTemplate tem;

	public List<userTransaction> selectAllTransaction() {
		return tem.find("from userTransaction");
	}

	public void insertTransaction(userTransaction tx) {
		tem.save(tx);
	}

	public HibernateTemplate getTem() {
		return tem;
	}

	public void setTem(HibernateTemplate tem) {
		this.tem = tem;
	}

	@Override
	public String toString() {
		return "TransactionDAO [tem=" + tem + "]";
	}

}
