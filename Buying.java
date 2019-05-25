package com.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Buying")
@EntityListeners(AuditingEntityListener.class)

public class Buying {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
		
	@NotBlank
	private String user_id;
	
	@NotBlank
	private String item_id;
	
	@NotBlank
	private String order_name;
			
	@NotBlank
	private String delivery_name;
	
	@NotBlank
	private String delivery_address;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getDelivery_name() {
		return delivery_name;
	}

	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
}
	
	
	

	
