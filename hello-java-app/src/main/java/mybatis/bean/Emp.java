package mybatis.bean;

import java.util.Date;

public class Emp {
	
	private Integer empid;
	private String empname;
	private Integer salary;
	private Character sex;
	private Date bdate;
	private Integer deptid;
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", sex=" + sex + ", bdate="
				+ bdate + ", deptid=" + deptid + "]";
	}
	
}
