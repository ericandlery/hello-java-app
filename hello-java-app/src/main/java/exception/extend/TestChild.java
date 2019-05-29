package exception.extend;

import java.io.IOException;

public class TestChild extends TestParent{

	@Override
	public void show() throws ArithmeticException{
		// TODO Auto-generated method stub
		System.out.println("Child");
	}

//	@Override
//	public void show() throws IOException {
//		try {
//			super.show();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	

}
