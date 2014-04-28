package com.thanakorn.controller;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.thanakorn.DAO.TransactionDAO;
import com.thanakorn.entity.stockData;
import com.thanakorn.entity.userData;
import com.thanakorn.entity.userTransaction;
import com.thanakorn.service.UserService;

public class ActionController extends HibernateDaoSupport {

	userData user;
	stockData stock;
	Integer amount;
	@Autowired
	UserService service;
	
	
	public String InsertTransaction(){
//		service.saveTransaction(new userTransaction(user, stock, amount));
		service.showAllTransaction();
		return "success";
	}

//	public static void main(String args[]) {
//		UserService service = (UserService) new ClassPathXmlApplicationContext(
//				"classpath:Beans.xml").getBean("user_service");
//		System.out.print(service.showAllTransaction());
//	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public userData getUser() {
		return user;
	}

	public void setUser(userData user) {
		this.user = user;
	}

	public stockData getStock() {
		return stock;
	}

	public void setStock(stockData stock) {
		this.stock = stock;
	}

	// TransactionDAO tx;
	//
	// HibernateTemplate hi;
	//
	// public TransactionDAO getTx() {
	// return tx;
	// }
	//
	// public void setTx(TransactionDAO tx) {
	// this.tx = tx;
	// }
	//
	// public HibernateTemplate getHi() {
	// return hi;
	// }
	//
	// public void setHi(HibernateTemplate hi) {
	// this.hi = hi;
	// }
	//
	// private String exeute() {
	// // WebApplicationContext context = WebApplicationContextUtils
	// // .getRequiredWebApplicationContext(ServletActionContext
	// // .getServletContext());
	// // TransactionDAO tx = context.getBean(TransactionDAO.class);
	// // HibernateTemplate hi = context.getBean(HibernateTemplate.class);
	// // // tx.insertTransaction(new userTransaction(hi.get(userData.class,
	// // 1), hi
	// // // .get(stockData.class, 1), 1));
	// // System.out.print(tx.selectAllTransaction());
	//
	// return "success";
	// }
	//
	// public String insertData() {
	//
	// // WebApplicationContext context = WebApplicationContextUtils
	// // .getRequiredWebApplicationContext(ServletActionContext
	// // .getServletContext());
	// getHibernateTemplate().save(new
	// userTransaction(getHibernateTemplate().get(userData.class,
	// 1), getHibernateTemplate()
	// .get(stockData.class, 1), 1));
	// // ApplicationContext context = new ClassPathXmlApplicationContext(
	// // "classpath:Beans.xml");
	// // TransactionDAO tx = context.getBean(TransactionDAO.class);
	// // HibernateTemplate hi = context.getBean(HibernateTemplate.class);
	// // tx.insertTransaction(new userTransaction(hi.get(userData.class,
	// // 1), hi
	// // .get(stockData.class, 1), 1));
	// return "success";
	// }
}
