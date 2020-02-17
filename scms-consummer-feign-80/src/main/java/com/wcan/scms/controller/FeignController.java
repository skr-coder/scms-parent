package com.wcan.scms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcan.scms.entity.Dept;
import com.wcan.scms.service.DeptClientService;

@RestController
public class FeignController {
	
	@Autowired
	private DeptClientService feignService;
	
	@RequestMapping(value="/consummer/feign/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept) {
		return feignService.add(dept);
	}
	
	@RequestMapping(value="/consummer/feign/dept/get/{deptNo}",method=RequestMethod.GET)
	public Dept getById(@PathVariable("deptNo") Integer deptNo) {
		return feignService.get(deptNo);
	}
	
	@RequestMapping(value="/consummer/feign/dept/get/all", method=RequestMethod.GET)
	public List<Dept> getList() {
		return feignService.getAll();
	}

}