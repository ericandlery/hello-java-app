package mockito.hello;

public class AddServiceImpl implements AddService {

	@Override
	public int add(int n1, int n2) {
		
		System.out.println("Add Service Executing");
		
		return n1+n2;
		
	}

}
