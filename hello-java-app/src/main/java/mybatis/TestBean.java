package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestBean {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory ssf=null;
		Reader r=Resources.getResourceAsReader("mybatis/hello-batis.xml");
		ssf=new SqlSessionFactoryBuilder().build(r);
		r.close();
		
		ssf.getConfiguration().addMapper(MyMapper2.class);
		SqlSession s=ssf.openSession();
		
//		System.out.println((Object)s.selectOne("getEmps"));
		System.out.println(((List)s.selectList("getEmps")).get(2));
		
		s.close();

	}

}
