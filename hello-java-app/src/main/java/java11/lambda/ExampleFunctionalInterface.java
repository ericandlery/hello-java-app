package java11.lambda;

import java.util.Date;

@FunctionalInterface
public interface ExampleFunctionalInterface {
	
	void test(Date date);
	
//	void haha();
	
	default void ignoreMe() {
		System.out.println("Please ignore me!");
	};
	
	public static void main(String[] args) {
		System.out.println("Intensional Functional Interface");
		
		ExampleFunctionalInterface ex=new ExampleFunctionalInterface() {
			@Override
			public void test(Date date) {
				System.out.println("現在時間=>"+date);
			}
		};
		ex.test(new Date());
		ex.ignoreMe();
		
		ExampleFunctionalInterface exL=(Date date)->System.out.println("The time is now! "+date);
		exL.test(new Date());
		exL.ignoreMe();
		
		System.out.println("=".repeat(150));
	}

}
