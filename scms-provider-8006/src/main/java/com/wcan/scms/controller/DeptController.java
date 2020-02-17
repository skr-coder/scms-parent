package com.wcan.scms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcan.scms.entity.Dept;
import com.wcan.scms.service.DeptService;

@RestController//相当于@Controller+@ResponseBody
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/add", method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		
		return deptService.addDept(dept);
	}
	
	@RequestMapping(value="/dept/get/{deptNo}", method=RequestMethod.GET)
	public Dept get(@PathVariable("deptNo") Integer deptNo) {
		return deptService.findById(deptNo);
	}
	
	@RequestMapping(value="/dept/get/all", method=RequestMethod.GET)
	public List<Dept> getAll() {
		return deptService.findAll();
	}

}