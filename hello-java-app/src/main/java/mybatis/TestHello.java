package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestHello {

	private static SqlSessionFactory factory=null;
	private static final String RESOURCE="mybatis/mybatis-config.xml";
	
	public static void main(String[] args) throws IOException {
		
		Reader reader=null;
		SqlSession session=null;
		
		reader=Resources.getResourceAsReader(RESOURCE);
		factory=new SqlSessionFactoryBuilder().build(reader);
		factory.getConfiguration().addMapper(MyMapper.class);
		reader.close();
		
		session=factory.openSession();
		String str=session.selectOne("getVersion");
		System.out.println("version="+str);
		System.out.println((String)session.selectOne("getTodayName"));
		
		session.close();
		
	}

}
