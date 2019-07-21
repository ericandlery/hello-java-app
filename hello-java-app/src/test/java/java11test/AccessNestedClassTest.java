package java11test;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import java11test.NestedAccessTest.NestedClass;

public class AccessNestedClassTest {
	
	@Test
	void test() throws Exception {
		NestedAccessTest n=new NestedAccessTest();
//		n.doPublic();
		NestedAccessTest.NestedClass nn=n.new NestedClass();
//		nn.doNested();
		
		Method m=nn.getClass().getDeclaredMethod("doNested");
		System.out.println(m);
		m.invoke(nn);
	}

}
