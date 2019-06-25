package mockito.hello;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class CalcService1Test {
	
	@Test
	public void test() {
		
		System.out.println("Kimi");
		
		AddService addService;
		CalcService calcService;
		
		addService=mock(AddService.class);
		calcService=new CalcService(addService);
		
		int n1=13;
		int n2=31;
		int result=44;
		
		System.out.println("Before="+result);
		
		when(addService.add(n1, n2)).thenReturn(88);
		
		System.out.println("After"+result);
		
		int realResult=calcService.calc(n1, n2);
		System.out.println("Real Result="+realResult);
		try {
			assertEquals(result,realResult);
		}catch(AssertionFailedError e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Ralf");
		///////////////////////////
		System.out.println("KIMI2");
		
		addService=new AddServiceImpl();
		calcService=new CalcService(addService);
		System.out.println(calcService.calc(n1, n2));
		
		System.out.println("RALF2");
		
	}

}
