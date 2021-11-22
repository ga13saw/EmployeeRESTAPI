package com.code4you;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Employee")
@EntityListeners(AuditingEntityListner.class)
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@NotBlank
private String name;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

}
