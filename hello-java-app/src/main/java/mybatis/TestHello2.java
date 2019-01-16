package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestHello2 {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory ssf=null;
		SqlSession s=null;
		
		Reader reader=Resources.getResourceAsReader("mybatis/hello-batis.xml");
		ssf=new SqlSessionFactoryBuilder().build(reader);
		reader.close();
		
		ssf.getConfiguration().addMapper(MyMapper2.class);
		s=ssf.openSession();
		
		System.out.println((String)s.selectOne("getLastEmpName"));
		System.out.println((int)s.selectOne("getNumber"));
		System.out.println((Object)s.selectOne("getList"));
		System.out.println((Object)s.selectOne("getDate"));
		System.out.println((Object)s.selectOne("getUtilDate"));
		System.out.println((Object)s.selectOne("getKimi"));
		
		/*Doesn't work.*/
//		s.selectOne("select version()");
		System.out.println();
		
		System.out.println((String)s.selectOne("getNameById",1));
		System.out.println((String)s.selectOne("getNameById",3));
		System.out.println((String)s.selectOne("getNameById",99));
		
		s.close();

	}

}
