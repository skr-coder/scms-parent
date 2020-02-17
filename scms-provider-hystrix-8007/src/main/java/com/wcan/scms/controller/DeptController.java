package com.wcan.scms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wcan.scms.entity.Dept;
import com.wcan.scms.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/get/{deptNo}", method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="hystrixGet")
	public Dept get(@PathVariable("deptNo") Integer deptNo) {
		
		Dept dept = deptService.findById(deptNo);
		
		if(dept == null) {
			throw new RuntimeException("未找到和"+deptNo+"对应的信息！");
		}
		
		return dept;
	}
	
	public Dept hystrixGet(@PathVariable("deptNo") Integer deptNo) {
		
		return new Dept(deptNo, "与"+deptNo+"对应的Dept信息未找到！", "对应数据库信息未找到！");
	}

}
