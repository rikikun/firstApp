package com.thanakorn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TRANSACTION")
public class userTransaction {

	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_ID")
	private Integer transactionId;

	@ManyToOne()
	@JoinColumn(name = "USER_ID")
	private userData user;

	@ManyToOne()
	@JoinColumn(name = "STOCK_ID")
	private stockData stock;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "sum")
	private Float sum;

	public userTransaction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "userTransaction [transactionId=" + transactionId + ", user="
				+ user + ", stock=" + stock + ", amount=" + amount + ", sum="
				+ sum + "]";
	}

	public userTransaction(userData user, stockData stock, Integer amount) {
		super();
		this.user = user;
		this.stock = stock;
		this.amount = amount;
		this.sum = stock.getItemPrice() * amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getSum() {
		return sum;
	}

	public void setSum(Float sum) {
		this.sum = sum;
	}

	public stockData getStock() {
		return stock;
	}

	public void setStock(stockData stock) {
		this.stock = stock;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public userData getUser() {
		return user;
	}

	public void setUser(userData user) {
		this.user = user;
	}

}
