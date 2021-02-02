package work.lollipops.service.impl;

import org.springframework.stereotype.Service;
import work.lollipops.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello() {
		System.out.println("Hello World !");
		return "HelloWorld!";
	}
}
