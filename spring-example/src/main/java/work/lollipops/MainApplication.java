package work.lollipops;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import work.lollipops.service.HelloService;

import java.util.stream.Stream;

/**
 * @author zhaohaoren
 */

@Configuration
//AOP源码分析可以从这里入口
@EnableAspectJAutoProxy
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
