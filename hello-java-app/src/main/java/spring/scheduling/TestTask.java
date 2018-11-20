package spring.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class TestTask {
	
//	@Scheduled(fixedRate=1500)
	public void test() {
		System.out.println(this.getClass());
	}
	
	@Scheduled(cron="* * * ? * * ")
	public void testCron() {
		System.out.println("cron test");
	}

}
