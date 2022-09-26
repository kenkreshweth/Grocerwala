package com.app.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="order_details")
public class OrderDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int order_id;
	
//	@OneToOne(mappedBy="u_id")
	private int ouser_id;
	
	private double Delivery_charges,service_charges;
	private Date delivery_date_time;
	private int Item_qty;
	
	
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int ouser_id, int order_id, double delivery_charges, double service_charges,
			Date delivery_date_time, int item_qty) {
		super();
		this.ouser_id = ouser_id;
		this.order_id = order_id;
		//Hardcoded value is 40 rs
		Delivery_charges = 40;
		this.service_charges = service_charges;
		this.delivery_date_time = delivery_date_time;
		Item_qty = item_qty;
	}

	public int getOuser_id() {
		return ouser_id;
	}

	public void setOuser_id(int ouser_id) {
		this.ouser_id = ouser_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getService_charges() {
		return service_charges;
	}

	public void setService_charges(double service_charges) {
		this.service_charges = service_charges;
	}

	public Date getDelivery_date_time() {
		return delivery_date_time;
	}

	public void setDelivery_date_time(Date delivery_date_time) {
		this.delivery_date_time = delivery_date_time;
	}

	public int getItem_qty() {
		return Item_qty;
	}

	public void setItem_qty(int item_qty) {
		Item_qty = item_qty;
	}

	@Override
	public String toString() {
		return "OrderDetails [ouser_id=" + ouser_id + ", order_id=" + order_id + ", Delivery_charges="
				+ Delivery_charges + ", service_charges=" + service_charges + ", delivery_date_time="
				+ delivery_date_time + ", Item_qty=" + Item_qty + "]";
	}
	
	
	
}
