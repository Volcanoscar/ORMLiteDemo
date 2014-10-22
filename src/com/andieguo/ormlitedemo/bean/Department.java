package com.andieguo.ormlitedemo.bean;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="tb_department")
public class Department {

	@DatabaseField(generatedId=true) 
	private Integer id;
	
	@DatabaseField(canBeNull=false,width=20)
	private String name;
	  /** 
     * 1��������Ҫע����ǣ���������ֻ����ForeignCollection<T>����Collection<T> 
     * 2��eager=false ��ʾ�����أ��ӳټ��أ�,��ѯDepartmentʱ������ѯ��Ӧ��Employee;
     * 3��eager=true ��ʾ�������أ���ѯDepartmentʱ����ѯ���ж�Ӧ��Employee;
     * 
     */  
	@ForeignCollectionField(eager = true) 
	private ForeignCollection<Employee> employees;
	
	public Department( String name) {
		this.name = name;
	}
	
	public Department() {
		super();
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
	public ForeignCollection<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ForeignCollection<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name  + "]";
	}

}
