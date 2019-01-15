package mybatis;

import org.apache.ibatis.annotations.Select;

public interface MyMapper {
	
	@Select(value="select version()")
	public String getVersion();
	
	@Select(value="select t.name from myjava.product t where t.id=7")
	public String getTodayName();

}
