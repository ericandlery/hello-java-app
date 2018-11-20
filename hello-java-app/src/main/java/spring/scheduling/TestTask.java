package spring.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class TestTask {
	
	@Scheduled(fixedRate=1500)
	public void test() {
		System.out.println(this.getClass());
	}

}
