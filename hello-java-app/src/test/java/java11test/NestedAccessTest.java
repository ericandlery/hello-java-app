package java11test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NestedAccessTest {
	
	public void doPublic() {
		System.out.println("Public Method");
	}
	
	private void doPrivate() {
		System.out.println("Private! Don't look!");
	}
	
	class NestedClass{
		public void doNested() {
			doPublic();
			doPrivate();
		}
	}
	
	@Test
	void test() throws Exception {
		System.out.println("Jupiter 5");
//		doPublic();
//		doPrivate();
		NestedAccessTest obj=new NestedAccessTest();
		obj.doPrivate();
		NestedClass obj2=new NestedClass();
		obj2.doNested();
	}

}
