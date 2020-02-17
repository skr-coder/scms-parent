package com.wcan.scms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wcan.scms.entity.Dept;


@Mapper//千万记得加这个注解！！！
public interface DeptMapper {
	
	Dept findById(Integer deptNo);
	
	List<Dept> findAll();
	
	boolean addDept(Dept dept);

}