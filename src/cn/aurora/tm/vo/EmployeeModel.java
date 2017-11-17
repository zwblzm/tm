package cn.aurora.tm.vo;
/**
 * 员工实体类
 * @author Administrator
 *
 */
public class EmployeeModel {

	private String id;//唯一主键
	private String name;//员工姓名
	private String password;//员工密码
	private String capinfoId;//员工capinfo工号
	private Integer state;//状态   0.无状态，1.新建，2.在职，3.离职，4.注销
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getCapinfoId() {
		return capinfoId;
	}
	public void setCapinfoId(String capinfoId) {
		this.capinfoId = capinfoId;
	}
	
	@Override
	public String toString() {
		return "EmployModel [id=" + id + ", name=" + name + ", password="
				+ password + ", state=" + state + "]";
	}
	
	
	
}
