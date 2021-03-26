package com.flexon.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.scheduling.support.SimpleTriggerContext;

//@Entity: Specifies that the class is an entity. This annotation is applied to the entity class.
//@Id: Specifies the primary key of an entity.
//@GeneratedValue: Provides for the specification of generation strategies for the values of primary keys.
//public order(): Default constructor to make JPA Happy
@Entity
public class Orders {
	@Id
	@GeneratedValue
	private Long Id;
	private Long ItemId;
	private int Quantity;
	private String ShippingAddress;
	private String ShippingDate;
	private String Status;
	
	public Orders() {
		super();
	}
	public Orders (Long Id,Long ItemId,int Quantity,String ShippingAddress,String ShippingDate,String Status ) {
		super();
		this.Id = Id;
		this.ItemId=ItemId;
		this.Quantity = Quantity;
		this.ShippingAddress=ShippingAddress;
		this.ShippingDate=ShippingDate;
		this.Status=Status;
	}
		
		
		public Long getId() {
			return Id;
		}
		
		public void setId(Long Id) {
			this.Id = Id;
		}
		
		
		public Long getItemId() {
			return Id;
		}
		
		public void setItemId(Long ItemId) {
			this.ItemId = ItemId;
		}
		
		
		public int getQuantity() {
			return Quantity;
		}
		
		public void setQuantity(int Quantity) {
			this.Quantity=Quantity;
		}
		
		
		
		public String getShippingAddress() {
			return ShippingAddress;
		}
		public void setShippingAddress(String ShippingAddress) {
			this.ShippingAddress= ShippingAddress;
		}
		
		public String getShippingDate() {
			return ShippingDate;
		}
		public void setShippingDate(String ShippingDate) {
			this.ShippingDate= ShippingDate;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String Status) {
			this.Status=Status;
		}
		
}
