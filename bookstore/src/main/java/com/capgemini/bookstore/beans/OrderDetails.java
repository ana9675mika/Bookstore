package com.capgemini.bookstore.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="OrderDetails")
public class OrderDetails {

	@Id
	@Column(name="orderdetailsid")
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderDetailsId;

	@Column(name="quantity")
	@NotNull
	private int quantity;
	
	@Column(name="subtotal")
	@NotNull
	private float subtotal;
	
	@Column(name="total")
	@NotNull
	private float total;
	
	@Column(name="orderstatus")
	@NotNull
	@Size(min=5)
	@Size(max=20)
	private String orderStatus;
	
	@Column(name="paymentmethod")
	@NotNull
	private String paymentMethod;
	
	@Column(name="orderdetailsdate")
	@NotNull
	private LocalDate date;

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", quantity=" + quantity + ", subtotal=" + subtotal
				+ ", total=" + total + ", orderStatus=" + orderStatus + ", paymentMethod=" + paymentMethod + ", date="
				+ date + "]";
	}
	
	
}
