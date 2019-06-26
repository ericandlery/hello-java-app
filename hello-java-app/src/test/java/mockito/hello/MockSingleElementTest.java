package mockito.hello;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MockSingleElementTest {
	
	@Test
	public void test() {
		
		ArrayList<String> list=mock(ArrayList.class);
		
		System.out.println("Before="+list.get(0));
		when(list.get(0)).thenReturn("Kimi");
		System.out.println("After="+list.get(0));
		when(list.add("Ralf")).thenReturn(false);
		System.out.println(list.add("Ralf"));
		
		assertEquals(false,list.add("Ralf"));
		
	}

}
