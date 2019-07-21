package java11test;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class GeneralTest {
	
	@Test
	public void test() {
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vm.version"));
	}
	
	@Test
	public void testStringAPI() {
		var v="  Ralf  Mika   ";
		System.out.println("kimi");
		System.out.println("v="+v);
		System.out.println(v.isBlank());
		System.out.println(v.strip());
		System.out.println(v.lines().collect(Collectors.toList()));
		System.out.println(v.repeat(4));
		System.out.println("=".repeat(99));
	}

}
