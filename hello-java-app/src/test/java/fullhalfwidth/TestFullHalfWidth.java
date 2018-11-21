package fullhalfwidth;

import org.junit.Test;

public class TestFullHalfWidth {
	
	@Test
	public void test() {
		System.out.println("AAA");
		System.out.println("\u0041");
		System.out.println("A".equals("\u0041"));
		System.out.println();
		System.out.println("ＡＡＡ");
		System.out.println("\uff21");
		System.out.println("Ａ".equals("\uff21"));
		System.out.println();
		System.out.println("，");
		System.out.println(",");
		System.out.println( "\\u" + Integer.toHexString('，' | 0x10000).substring(1) );
		System.out.println(Integer.toHexString('，' | 0x0000));
		System.out.println("，".equals("\uff0c"));
	}

}
