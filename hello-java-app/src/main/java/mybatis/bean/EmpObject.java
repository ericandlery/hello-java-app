package mybatis.bean;

public class EmpObject {
	
	private Object empid;
	private Object empname;
	private Object salary;
	private Object sex;
	private Object bdate;
	private Object deptid;
	
	public Object getEmpid() {
		return empid;
	}
	public void setEmpid(Object empid) {
		this.empid = empid;
	}
	public Object getEmpname() {
		return empname;
	}
	public void setEmpname(Object empname) {
		this.empname = empname;
	}
	public Object getSalary() {
		return salary;
	}
	public void setSalary(Object salary) {
		this.salary = salary;
	}
	public Object getSex() {
		return sex;
	}
	public void setSex(Object sex) {
		this.sex = sex;
	}
	public Object getBdate() {
		return bdate;
	}
	public void setBdate(Object bdate) {
		this.bdate = bdate;
	}
	public Object getDeptid() {
		return deptid;
	}
	public void setDeptid(Object deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "EmpObject [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", sex=" + sex + ", bdate="
				+ bdate + ", deptid=" + deptid + "]";
	}

}
