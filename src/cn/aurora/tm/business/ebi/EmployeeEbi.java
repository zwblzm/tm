package cn.aurora.tm.business.ebi;

import cn.aurora.tm.vo.EmployeeModel;

public interface EmployeeEbi {

	EmployeeModel findEmployeeByName(String name);

}
