package google.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

public class OrderingApp {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(432);
		list.add(856);
		list.add(23);
		list.add(4);
		list.add(4535);
		list.add(343);
		list.add(431);
		
		Ordering<Integer> order=Ordering.natural();
		
		System.out.println(list);
		
		Collections.sort(list,order);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
