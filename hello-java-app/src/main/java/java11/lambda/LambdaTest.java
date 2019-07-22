package java11.lambda;

import java.util.Comparator;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		Comparator<FruitBean> c=new Comparator<FruitBean>() {
			@Override
			public int compare(FruitBean o1, FruitBean o2) {
				return Integer.valueOf(o1.getQuantity()).compareTo(o2.getQuantity());
			}
		};
		FruitBean o1=new FruitBean();
		o1.setName("Apple");
		o1.setQuantity(555);
		
		FruitBean o2=new FruitBean();
		o2.setName("Watermelon");
		o2.setQuantity(789);
		
		System.out.println("Prior to Java 8="+c.compare(o1, o2));
		System.out.println("Prior to Java 8="+c.compare(o2, o2));
		System.out.println("Prior to Java 8="+c.compare(o2, o1));
		System.out.println("=".repeat(150));
		
		Comparator<FruitBean> l=(FruitBean oo1,FruitBean oo2)->Integer.valueOf(o1.getQuantity()).compareTo(o2.getQuantity());
		
		System.out.println("After 8="+c.compare(o1, o2));
		System.out.println("After 8="+c.compare(o1, o1));
		System.out.println("After 8="+c.compare(o2, o1));

	}

}
