package com.andieguo.ormlitedemo.bean;

import com.j256.ormlite.field.DatabaseField;

public class User {
	
	@DatabaseField(generatedId = true)
	private Integer id;
	
	@DatabaseField(canBeNull=false,width=20)
	private String name;
	
	@DatabaseField(canBeNull=false,defaultValue = "24")
	private int age;
	
	/**
	 * columnName="cardid" ָ��������Ĭ��Ϊidcard_id;
	 *��foreignAutoCreate = true �ڲ���һ�����������Ķ���ʱ���Ƿ��Զ���������������
	 * foreignAutoRefresh = true  ����ѯ��һ���������ʱ���Ƿ��Զ�ˢ�� �� Order������Account������󣬵�����Order�ļ�¼ʱ�Ƿ�Ҳ����Account�ļ�¼�� Ĭ��Ϊfalse
	 */
	@DatabaseField(foreign=true,useGetSet=true,columnName="cardid",foreignAutoRefresh = true,foreignAutoCreate=true)
	private IDcard idcard;

	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name,IDcard idcard) {
		this.name = name;
		this.idcard = idcard;
	}

	public IDcard getIdcard() {
		return idcard;
	}

	public void setIdcard(IDcard idcard) {
		this.idcard = idcard;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", idcard=" + idcard + "]";
	}

}
