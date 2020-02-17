package com.wcan.scms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcan.scms.entity.Dept;
import com.wcan.scms.mapper.DeptMapper;
import com.wcan.scms.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public Dept findById(Integer deptNo) {
		return deptMapper.findById(deptNo);
	}

	@Override
	public List<Dept> findAll() {
		return deptMapper.findAll();
	}

	@Override
	public boolean addDept(Dept dept) {
		return deptMapper.addDept(dept);
	}

}