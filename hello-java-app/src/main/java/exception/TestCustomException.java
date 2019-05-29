package exception;

public class TestCustomException {

	public static void main(String[] args) {
		
		try {
			checkName("Kimi");
			checkName("Ralf");
		} catch (TestExtendException e) {
			e.printStackTrace();
			e.callOut();
		}

	}
	
	public static void checkName(String name) throws TestExtendException{
		if("Kimi".equals(name)) {
			System.out.println("You're Kimi!");
		}else {
			throw new TestExtendException(name);
		}
	}

}
