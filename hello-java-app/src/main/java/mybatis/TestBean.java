package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.bean.Emp;
import mybatis.bean.EmpObject;

public class TestBean {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory ssf=null;
		Reader r=Resources.getResourceAsReader("mybatis/hello-batis.xml");
		ssf=new SqlSessionFactoryBuilder().build(r);
		r.close();
		
		ssf.getConfiguration().addMapper(MyMapper2.class);
		SqlSession s=ssf.openSession();
		
//		System.out.println((Object)s.selectOne("getEmps"));
//		System.out.println(((List)s.selectList("getEmps")).get(2));
		
		List<Emp> emps=s.selectList("getEmps");
		for(Emp emp:emps) {
			System.out.println(emp);
		}
		
//		System.out.println(s.selectList("getEmpObjects").get(0).getClass());
		EmpObject eo=(EmpObject)s.selectList("getEmpObjects").get(0);
		System.out.println(eo.getBdate().getClass());
		System.out.println(eo.getDeptid().getClass());
		System.out.println(eo.getEmpid().getClass());
		System.out.println(eo.getEmpname().getClass());
		System.out.println(eo.getSalary().getClass());
		System.out.println(eo.getSex().getClass());
		
		s.close();

	}

}
