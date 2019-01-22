package mybatis;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import mybatis.bean.Emp;

public interface MyMapper3 {
	
	@Select(value="select t.empid,t.sex from emp t where t.empid=#{id}")
	@Results(value= {
			@Result(property="empid",column="empid"),
			@Result(property="sex",column="sex")
	})
	public Emp getEmp(Integer id);

}
