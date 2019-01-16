package mybatis;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class MyBatisConfig implements DataSourceFactory{

	private Properties prop;
	
	@Override
	public void setProperties(Properties props) {
		prop=props;
	}

	@Override
	public DataSource getDataSource() {
		
		PooledDataSource ds=new PooledDataSource();
		
		ds.setDriver(prop.getProperty("driver"));
		ds.setUrl(prop.getProperty("url"));
		ds.setUsername(prop.getProperty("username"));
		ds.setPassword(prop.getProperty("password"));
		
		return ds;
	}

}
