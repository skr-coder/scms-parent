package com.wcan.scms.factory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wcan.scms.entity.Dept;
import com.wcan.scms.service.DeptClientService;

import feign.hystrix.FallbackFactory;

@Component	//非常容易忘！！！
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable throwable) {
		
		return new DeptClientService() {
			
			@Override
			public Dept get(Integer deptNo) {
				return new Dept(deptNo, "与"+deptNo+"对应的信息未找到[Consummer]", "数据库不存在");
			}
			
			@Override
			public List<Dept> getAll() {
				return null;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
	}

}