package com.app.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity(name="items")
public class Items {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int i_id;

	
//	@ManyToOne
//	private List<Integer> admin_id;
	private String i_name;
	private String i_price;
	private String i_description;
	private String i_stock;
	private Date manufacture_date;
//	@OneToOne(mappedBy="cat_id")
	private int categoryid;
	
	public Items() {
		super();
		
	}

	public Items(List<Integer>admin_id, int i_id, String i_name, String i_price, String i_description, String i_stock,
			Date manufacture_date, int categoryid) {
		super();
//		this.admin_id =admin_id;
		this.i_id = i_id;
		this.i_name = i_name;
		this.i_price = i_price;
		this.i_description = i_description;
		this.i_stock = i_stock;
		this.manufacture_date = manufacture_date;
		this.categoryid = categoryid;
	}

//	public List<Integer> getU_id() {
//		return admin_id;
//	}
//
//	public void setU_id(List<Integer> admin_id) {
//		this.admin_id= admin_id;
//	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public String getI_price() {
		return i_price;
	}

	public void setI_price(String i_price) {
		this.i_price = i_price;
	}

	public String getI_description() {
		return i_description;
	}

	public void setI_description(String i_description) {
		this.i_description = i_description;
	}

	public String getI_stock() {
		return i_stock;
	}

	public void setI_stock(String i_stock) {
		this.i_stock = i_stock;
	}

	public Date getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(Date manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

//	@Override
//	public String toString() {
//		return "Items [u_id=" + admin_id + ", i_id=" + i_id + ", i_name=" + i_name + ", i_price=" + i_price
//				+ ", i_description=" + i_description + ", i_stock=" + i_stock + ", manufacture_date=" + manufacture_date
//				+ ", categoryid=" + categoryid + "]";
//	}
//	
	
}
