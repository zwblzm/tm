package cn.aurora.tm.business.ebo;

import cn.aurora.tm.business.ebi.EmployeeEbi;
import cn.aurora.tm.dao.dao.EmployeeDao;
import cn.aurora.tm.vo.EmployeeModel;

public class EmployeeEbo implements EmployeeEbi{

	@Override
	public EmployeeModel findEmployeeByName(String name) {
		EmployeeDao employeeDao;
		return null;
	}

}
