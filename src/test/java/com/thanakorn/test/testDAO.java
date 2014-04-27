package com.thanakorn.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.thanakorn.DAO.TransactionDAO;
import com.thanakorn.entity.stockData;
import com.thanakorn.entity.userData;
import com.thanakorn.entity.userTransaction;

public class testDAO {

	ApplicationContext context = new ClassPathXmlApplicationContext(
			"classpath:Beans.xml");

	HibernateTemplate hibernateTemplate = context
			.getBean(HibernateTemplate.class);

	TransactionDAO tx = context.getBean(TransactionDAO.class);

	@Test
	public void TestInsertTransaction() {
		tx.insertTransaction(new userTransaction(hibernateTemplate.get(
				userData.class, 1), hibernateTemplate.get(stockData.class, 1),
				5));
	}

	// @Test
	public void TestFucntionTransactionDAO() {
		System.out.print(tx.selectAllTransaction());
	}

	// @Test
	public void insertUserDataTest() {

		hibernateTemplate = context.getBean(HibernateTemplate.class);
		hibernateTemplate.save(new userData("root2", "rikikung", "1234"));
	}

	// @Test
	public void selectUserDataTest() {
		hibernateTemplate = context.getBean(HibernateTemplate.class);
		System.out.print(hibernateTemplate.get(userData.class, 1));
	}

	// @Test
	public void passwordUpdateToMd5Test() {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		hibernateTemplate = context.getBean(HibernateTemplate.class);
		@SuppressWarnings("unchecked")
		List<userData> userdata = hibernateTemplate.find("from userData");
		for (userData us : userdata) {
			us.setPassWord(passwordEncoder.encode(us.getPassWord()));
			hibernateTemplate.update(us);
		}
	}

	// @Test
	public void insertUserStockTransac() {
		hibernateTemplate = context.getBean(HibernateTemplate.class);
		hibernateTemplate.save(new userData("sss", "rikikung", "1234"));
		hibernateTemplate.save(new stockData("abcd", "ipadmini", 650.00f, 100));
		hibernateTemplate.save(new userTransaction());

	}

	// @Test
	public void insertTransactionFromAnyUser() {
		List<userData> user = hibernateTemplate.findByNamedParam(
				"FROM userData e WHERE e.userId=:ID", "ID", 1);
		List<stockData> stock = hibernateTemplate.find(
				"FROM stockData e WHERE e.stockId=? ", 1);
		hibernateTemplate.save(new userTransaction(user.get(0), stock.get(0),
				10));
	}

}
