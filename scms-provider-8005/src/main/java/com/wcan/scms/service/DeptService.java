package com.wcan.scms.service;

import java.util.List;

import com.wcan.scms.entity.Dept;

public interface DeptService {

	Dept findById(Integer deptNo);

	List<Dept> findAll();

	boolean addDept(Dept dept);
}
