package com.flexon.backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Catalog {
	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String name;
	
	public Catalog() {
		super();
	}

	public Catalog(Long id,String type,String name) {
		super();
		this.id=id;
		this.type=type;
		this.name=name;
	}
	public Long getSkuID() {
		return id;
	}
	public void setSkuID(Long id) {
		this.id=id;
	}
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
}
