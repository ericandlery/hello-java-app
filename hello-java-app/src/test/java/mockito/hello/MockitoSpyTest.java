package mockito.hello;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class MockitoSpyTest {
	
	@Test
	public void test() {
		
		List<String> list=new ArrayList<>();
		List<String> spyList=spy(list);
		System.out.println(list);
		System.out.println(spyList);
		
		spyList.add("McLaren");
		System.out.println(spyList.get(0));
		assertEquals("McLaren",spyList.get(0));
		when(spyList.get(0)).thenReturn("BAR");
		System.out.println(spyList.get(0));
		when(spyList.get(0)).thenReturn("BAR");
		
	}

}
