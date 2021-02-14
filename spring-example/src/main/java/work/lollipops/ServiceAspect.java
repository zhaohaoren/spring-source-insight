package work.lollipops;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

	@Pointcut("execution(* work.lollipops.service..*.*(..))")
	public void exec() {}

	@Around("exec()")
	public void around(){

	}
}
