package cn.aurora.tm.utils;

import javax.annotation.Resource;

import cn.aurora.tm.business.ebi.EmployeeEbi;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	protected T model;
	@Resource
	protected EmployeeEbi employeeEbi;
	@Override
	public T getModel() {
		
		
		return model;
	}
	
	
	
	

}
