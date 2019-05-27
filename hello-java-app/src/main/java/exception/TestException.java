package exception;

public class TestException {
	
	public static void main(String[] args) {
		
//		try {
//			System.out.println(1/0);
//		}catch(Error e) {
//			System.out.println("Error");
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(1/0);
//		}catch(ArithmeticException e) {
//			System.out.println("eee");
//			e.printStackTrace();
////			return;
////			System.exit(-1);
//		}finally {
//			System.out.println("FINALLY OVER!");
//		}
		
		try {
			System.out.println("Second Coming");
			System.out.println(1/0);
//		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Can't see me?");
//		}
		}finally {
			System.out.println("?? It's still working?");
		}
		
		System.out.println("Can you see me?");
		
	}
	
}
