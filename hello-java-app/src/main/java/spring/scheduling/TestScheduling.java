package spring.scheduling;

import java.util.Date;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Configuration
@EnableScheduling
//@Component
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
class SpringScheduling{
	
	private int i=0;
	
//	@Scheduled(fixedDelay=1000)
	void test() {
		System.out.println("Spring Scheduling Test fixedDelay: "+new Date()+" ### "+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+" is over");
		i++;
	}
	
	@Scheduled(fixedRate=1000)
	void test2() {
		System.out.println("Spring Scheduling Test fixedDelay: "+new Date()+" ### "+i);
		try {
			Thread.sleep(2500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+" is over");
		i++;
	}
	
//	@Scheduled(cron="")
	void cron() {
		
	}
	
}

//@Configuration
//@EnableScheduling
public class TestScheduling {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/spring/spring-config.xml");
//		SpringScheduling ss=ctx.getBean("springScheduling",SpringScheduling.class);
//		ss.test2();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext)ctx).close();

	}

}
