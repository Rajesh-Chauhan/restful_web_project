package com.restful_web.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	
	@Id
	private long itemId;
	
	@OneToMany
	private long orderId;
	
	private String itemName;
	private int itemUnitPrice;
	private float itemQuantity;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(int itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public float getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(float itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	
}
