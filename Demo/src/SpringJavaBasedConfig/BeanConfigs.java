package SpringJavaBasedConfig;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;

import jdk.jfr.Name;

//indicates that the class can be used by the Spring IoC container as a source of bean definitions
@Configuration
public class BeanConfigs {

	@Bean(name="p1")
	//@Scope("prototype")
	@Primary
	Processer getProcesor1() {
		return new Processer("MediaTex", null, null);
	}
	@Bean(name="p2")
	Processer getProcesor2() {
		return new Processer("MediaTex", null, null);
	}
	
	
//	@Bean
//	Processer getProcesor3() {
//		return new Processer("BlueOrigen", null, null);
//	}

	@Bean
	Laptop getLaptop() {
		return new Laptop();
	}
}
