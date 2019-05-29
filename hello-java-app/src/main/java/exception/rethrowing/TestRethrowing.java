package exception.rethrowing;

import java.io.IOException;
import java.sql.SQLException;

public class TestRethrowing {
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("kimi ooo");
		TestRethrowing t=new TestRethrowing();
		t.rethrow(false);
		
	}
	
	public void rethrow(Boolean b) throws SQLException, IOException {
		
		try {
			if(b!=null && b) {
				throw new SQLException("SQL 錯誤");
			}else if (b!=null && !b) {
				throw new IOException("IO錯誤");
			}else {
				throw new ArithmeticException("計算錯誤");
			}
		}catch(Exception e) {
			throw e;
		}
		
		
		
	}

}
