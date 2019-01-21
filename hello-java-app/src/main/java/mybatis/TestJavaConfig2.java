package mybatis;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import mybatis.bean.Emp;

public class TestJavaConfig2 {

	public static void main(String[] args) {
		
		DataSource ds=new PooledDataSource(
				"com.mysql.cj.jdbc.Driver",
				"jdbc:mysql://localhost:3306/mybatis_db?serverTimezone=UTC",
				"root",
				"123456"
				);
		Environment env=new Environment("Development",new JdbcTransactionFactory(),ds);
		Configuration config=new Configuration(env);
		config.addMapper(MyMapper2.class);
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(config);
		
		try(SqlSession s=ssf.openSession()){
			
			System.out.println("Java Config Version="+(String)s.selectOne("getVersion"));
			
//			System.out.println((Map)s.selectMap("getEmpByKey","empid"));
			Map<Integer,Emp> empMap=s.selectMap("getEmpByKey","empid");
			System.out.println(empMap.get(1));
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
