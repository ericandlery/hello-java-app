package spring.scheduling;

import org.springframework.scheduling.annotation.Scheduled;

public class TestTask {
	
	@Scheduled(fixedRate=1500)
	public void test() {
		System.out.println(this.getClass());
	}

}
