package mockito.hello;

import static org.mockito.Mockito.*;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.VerificationModeFactory;

public class VerifyInteractionTest {
	
	@Test
	public void test() {
		
		List<String> list=mock(List.class);
		System.out.println("Mock List="+list);
		
		list.add("Kimi");
		list.add("Ralf");
		list.add("Mika");
		list.add("David");
		list.add("David");
		list.clear();
		
		System.out.println(list);
		
		verify(list).add("Ralf");
		verify(list).add("Kimi");
		verify(list,VerificationModeFactory.times(2)).add("David");
		verify(list).clear();
		
	}

}
