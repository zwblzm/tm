package cn.aurora.tm.web.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.aurora.tm.utils.BaseAction;
import cn.aurora.tm.vo.EmployeeModel;
@Controller
@Scope("prototype")
public class EmployeeAction extends BaseAction<EmployeeModel>{
	
	
	public String login() {
		String name = model.getName();
		EmployeeModel employee = employeeEbi.findEmployeeByName(name);
		
		
		return SUCCESS;
		
	}
	
	
	

}
