package mybatis;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import mybatis.bean.Emp;
import mybatis.bean.EmpObject;

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
	
	@Select(value="select * from emp")
	public List<EmpObject> getEmpObjects();
	
	@Select(value="select * from emp t where t.empid=#{empid}")
	public Emp getEmpById(Integer empid);
	
	/*It also works without parameters?*/
	@Select(value="select * from emp t where t.empid=#{empid}")
	public Emp getEmpById2();
	
	@Select(value="select * from emp t where t.bdate=#{bdate};")
	public Emp getEmpByBdate(Object bdate);
	
	@Select(value="select t.empname,t.sex,t.bdate from emp t where t.empid in (#{id});")
	public List<Emp> getSomeEmps(Integer id);
	
	@Select(value="select * from emp t")
	@MapKey(value="empid")
	public Map<Integer,Emp> getEmpByKey();

}
