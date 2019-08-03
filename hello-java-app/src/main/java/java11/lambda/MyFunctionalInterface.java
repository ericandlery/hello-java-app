package java11.lambda;

interface NestedInterface{
	
	FruitBean modify(String name,int num);
	
	default void show() {
		System.out.println("I'm Nested Interface!!!");
	}
	
}

public interface MyFunctionalInterface {
	
	void testMine(Boolean b);
	
//	void test2();
	
	default void show() {
		System.out.println("My Kimi!");
	}
	
	default void display() {
		System.out.println("Version 1.0");
	};
	
	default void doNest() {
//		NestedInterface aaa=null;
//		aaa=(String name,int num)->return new FruitBean();
	}

}
