package com.arman.learnGraphQL.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity
@Table(name="winner")
@EntityListeners(EnableJpaAuditing.class)
public class Winner implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String field;
	
	@Column
	private String country;
	
	@ManyToMany(fetch=FetchType.EAGER)// default is lazy but it was giving org.hibernate.LazyInitializationException error bcz https://stackoverflow.com/questions/22821695/lazyinitializationexception-failed-to-lazily-initialize-a-collection-of-roles
	@JoinTable(name="winner_award",
				joinColumns = @JoinColumn(name="winner_id"),
				inverseJoinColumns = @JoinColumn(name="award_id"))
	private Set<Award> awards;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Winner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", field=" + field
				+ ", country=" + country + ", awards=" + awards + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Award> getAwards() {
		return awards;
	}

	public void setAwards(Set<Award> awards) {
		this.awards = awards;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
