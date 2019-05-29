package com.vinayak.dao;

import java.util.List;

import com.vinayak.model.TTEmployee;

public interface TTEmployeeDao {
public TTEmployee addEmployee(TTEmployee empl);
public List<TTEmployee> viewEmployee();
public TTEmployee getObject(int primary);
public int updateEmployee(TTEmployee ttemp);
public int deleteEmployee(int primary);
}
