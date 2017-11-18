package cn.aurora.tm.utils;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.aurora.tm.business.ebi.EmployeeEbi;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	protected T model;
	@Resource
	protected EmployeeEbi employeeEbi;
	@Override
	public T getModel() {
		
		
		return model;
	}
	
	
	
	

}
