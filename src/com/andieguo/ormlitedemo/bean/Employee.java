package com.andieguo.ormlitedemo.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="tb_employee")
public class Employee {
	
	@DatabaseField(generatedId=true)
	private Integer id;
	
	@DatabaseField(canBeNull=false,width=20)
	private String name;
	/**
	 * foreign = true;˵������һ���ⲿ���ù�ϵ
	 * foreignAutoRefresh =true;�����󱻲�ѯʱ���Զ����������ȡ��employee����������(������ѯ)
	 * foreignAutoCreate=true;�ڲ���һ�����������Ķ���ʱ���Ƿ��Զ��������������󣨽�����ӣ�
	 * 
	 */
	@DatabaseField(foreign = true,columnName="depid",foreignAutoRefresh = true,foreignAutoCreate=true)
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee( String name) {
		this.name = name;
	}
	
	public Employee( String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department + "]";
	}
	
	
	
}
