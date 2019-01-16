package mybatis;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class TestHelloJavaConfig {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.setProperty("driver","com.mysql.cj.jdbc.Driver");
		prop.setProperty("url","jdbc:mysql://localhost:3306/mybatis_db?serverTimezone=UTC");
		prop.setProperty("username","root");
		prop.setProperty("password","123456");
		
		MyBatisConfig config=new MyBatisConfig();
		config.setProperties(prop);
		DataSource ds=config.getDataSource();
		
		TransactionFactory trxF=new JdbcTransactionFactory();
		Environment env=new Environment("development", trxF, ds);
		Configuration conf=new Configuration(env);
		conf.addMapper(MyMapper2.class);
		
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(conf);
		
		try(SqlSession s=ssf.openSession()){
			System.out.println("Java Conf="+(String)s.selectOne("getLastEmpName"));
		}

	}

}
