package com.arman.learnGraphQL.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
@Table(name="award")
@EntityListeners(EnableJpaAuditing.class)
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class Award implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String field;
	
	@Column
	private String country;

	@Override
	public String toString() {
		return "Award [id=" + id + ", name=" + name + ", field=" + field + ", country=" + country + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
