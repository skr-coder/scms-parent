package com.wcan.scms.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wcan.scms.entity.Dept;
import com.wcan.scms.factory.DeptClientServiceFallBackFactory;

//指定要调用的微服务名称
@FeignClient(value="scms-dept",fallbackFactory=DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
	
	@RequestMapping(value="/dept/add", method=RequestMethod.POST)
	public boolean add(Dept dept);
	
	@RequestMapping(value="/dept/get/{deptNo}", method=RequestMethod.GET)
	public Dept get(@PathVariable("deptNo") Integer deptNo);
	
	@RequestMapping(value="/dept/get/all", method=RequestMethod.GET)
	public List<Dept> getAll();

}