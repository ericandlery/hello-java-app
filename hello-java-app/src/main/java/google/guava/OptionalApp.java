package google.guava;

import com.google.common.base.Optional;

public class OptionalApp {
	
	public static void main(String[] args) {
		
		Integer a=555;
		Integer b=null;
		
		Optional<Integer> aa=Optional.fromNullable(a);
		Optional<Integer> bb=Optional.fromNullable(b);
		
//		System.out.println(Integer.sum(a, b));
		System.out.println(aa.isPresent());
		System.out.println(bb.isPresent());
		
		Integer aaa=aa.or(777);
		Integer bbb=bb.or(123);
		System.out.println(aaa+" "+bbb);
		
	}

}
