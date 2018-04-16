package com.chc.SpringBootMybatis.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EMP implements Serializable {
	@Id
	private String id;
	private String ename;
	private String age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public EMP() {
		super();
	}
	public EMP(String id, String ename, String age) {
		super();
		this.id = id;
		this.ename = ename;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EMP [id=" + id + ", ename=" + ename + ", age=" + age + "]";
	}
	
}
