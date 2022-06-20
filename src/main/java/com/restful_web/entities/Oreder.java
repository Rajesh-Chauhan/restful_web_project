package com.restful_web.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Oreder {
	
	@Id
	public long orderId;
	public Date orderDate;
	String orderStatus;
	String collectionOfItems;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getCollectionOfItems() {
		return collectionOfItems;
	}
	public void setCollectionOfItems(String collectionOfItems) {
		this.collectionOfItems = collectionOfItems;
	}
	
}
