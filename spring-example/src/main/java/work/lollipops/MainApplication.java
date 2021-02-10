package work.lollipops;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.lollipops.service.HelloService;

import java.util.stream.Stream;

/**
 * @author zhaohaoren
 */

@Configuration
@ComponentScan("work.lollipops")
public class MainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(MainApplication.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(System.out::println);

		HelloService helloServiceImpl = applicationContext.getBean("helloServiceImpl", HelloService.class);
		helloServiceImpl.sayHello();

		Object bean = applicationContext.getBean("postProcessor01");
		System.out.println(bean);
	}
}
