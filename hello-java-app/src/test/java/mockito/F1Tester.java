package mockito;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class F1Tester {
	
	public static void main(String[] args) {
		
		FOM fom=new FOM();
		F1CarService service=mock(F1CarService.class);
		fom.setCarService(service);
		
		List<F1Car> cars=new ArrayList<>();
		F1Car c1=new F1Car();
		c1.setName("MP4-17");
		c1.setRpm(18200);
		c1.setTeam("McLaren");
		c1.setFoundedDate(new Date());
		cars.add(c1);
		
		F1Car c2=new F1Car();
		c2.setName("FW27");
		c2.setRpm(19000);
		c2.setTeam("Williams");
		c2.setFoundedDate(new Date());
		cars.add(c2);
		
		System.out.println(cars);
		
		fom.setCars(cars);
		when(service.getRank(c1)).thenReturn(987);
		
		int value=fom.getCarValue();
		System.out.println(value);
		
	}

}
