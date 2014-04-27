package com.thanakorn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_DATA")
public class stockData {

	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID")
	private Integer stockId;

	@Column(name = "ITEM_CODE", unique = true)
	private String itemCode;

	@Column(name = "ITEM_NAME", unique = true, nullable = false)
	private String itemName;

	@Column(name = "ITEM_PRICE", precision = 2, nullable = false)
	private Float itemPrice;

	@Column(name = "ITEM_AMOUNT", nullable = false)
	private Integer itemAmount;

	public stockData() {
		// TODO Auto-generated constructor stub
	}

	public stockData(String itemCode, String itemName, Float itemPrice,
			Integer itemAmount) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemAmount = itemAmount;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(Integer itemAmount) {
		this.itemAmount = itemAmount;
	}

}
