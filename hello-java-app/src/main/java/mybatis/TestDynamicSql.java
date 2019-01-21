package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.bean.Emp;

public class TestDynamicSql {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory ssf=null;
		Reader r=Resources.getResourceAsReader("mybatis/hello-batis.xml");
		ssf=new SqlSessionFactoryBuilder().build(r);
		r.close();
		ssf.getConfiguration().addMapper(MyMapper2.class);
		SqlSession s=ssf.openSession();
		
		Emp emp=s.selectOne("getEmpById",3);
		System.out.println(emp);
		
		/*Strangely, it works even if you pass some random parameters.*/
		Emp emp2=s.selectOne("getEmpById2","2h4g4t");
		System.out.println(emp2);
		
		/*String also works.*/
		Emp emp3=s.selectOne("getEmpByBdate","20020326");
		System.out.println("DATE="+emp3);
		
		/*What a chore.*/
		Calendar ca=Calendar.getInstance();
		ca.set(2002, 2, 26);
		Emp emp4=s.selectOne("getEmpByBdate",new java.sql.Date(ca.getTime().getTime()));
		System.out.println("Calendar="+emp4);
		
		List<Emp> emps5=s.selectList("getSomeEmps",2);
		System.out.println("List="+emps5);
		
		s.close();

	}

}
