package mockito;

public class FullName {
	
	private static final String SPACE=" ";
	
	private String firstName;
	private String lastName;
	private String fullName;
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String first,String last) {
		
		if(first==null || last==null) {
			throw new RuntimeException("No Names!");
		}else {
			fullName=first+SPACE+last;
		}
			
	}

}
