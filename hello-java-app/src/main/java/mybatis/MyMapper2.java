package mybatis;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import mybatis.bean.Emp;

public interface MyMapper2 {
	
	@Select(value="select t.empname from emp t order by t.empid desc limit 1")
	public String getLastEmpName();
	
	@Select(value="select version()")
	public String getVersion();
	
	@Select(value="select 123")
	public int getNumber();
	
	@Select(value="select * from emp t limit 1")
	public Object getList();
	
	@Select(value="select bdate from emp t limit 1")
	public Date getDate();
	
	@Select(value="select bdate from emp t limit 1")
	public java.util.Date getUtilDate();
	
	@Select(value="select * from emp t limit 1")
	public Emp getOneEmp();
	
	@Select(value="select * from emp")
	public List<Emp> getEmps();

}
