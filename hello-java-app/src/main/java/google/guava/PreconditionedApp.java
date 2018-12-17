package google.guava;

import com.google.common.base.Preconditions;

public class PreconditionedApp {
	
	public static void main(String[] args) {
		
		Integer a=567;
		Integer b=124;
		
//		a=null;
		a=-555;
		
		System.out.println(Preconditions.checkNotNull(a,"Guava rocks!"));
		Preconditions.checkArgument(a<0,"Negative Argue!",0-a);
		Preconditions.checkElementIndex(-a,565,"checkElement");
		
	}

}
