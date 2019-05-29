package exception;

public class TestExtendException extends Exception{
	
	public TestExtendException(String name) {
		super("名字: "+name+" 不符");
	}
	
	public void callOut() {
		System.out.println("立即呼叫工作人員");
	}

}
