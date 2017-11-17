package cn.aurora.tm.web.action;

import cn.aurora.tm.utils.BaseAction;
import cn.aurora.tm.vo.EmployeeModel;

public class EmployeeAction extends BaseAction<EmployeeModel>{
	
	
	public String login() {
		String name = model.getName();
		EmployeeModel employee = employeeEbi.findEmployeeByName(name);
		
		
		return SUCCESS;
		
	}
	
	
	

}
