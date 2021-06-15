package SpringJavaBasedConfig;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class MainApplicationConetxt {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John","Paul","Ringo"); 
		
		
        Optional<String> s=names.stream().max(Comparator.comparingInt(String::length));
        
        if
        (s.isPresent()) {
        	System.out.println(s.get());
        }

		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigs.class);

	
		
		
//		Processer processer1 = ctx.getBean(Processer.class);
//		processer1.setName("mediatek");
//		processer1.setCountryOfOrigen("Japan");
//		processer1.setHertz("2.4GHZ");
//
//		
//		Processer processer2 = ctx.getBean(Processer.class);
//		processer2.setName("Qualcom");
//		processer2.setCountryOfOrigen("US");
//		processer2.setHertz("3.4GHZ");
//		
//		Processer processer3 = ctx.getBean(Processer.class);
//		processer3.setName("BlueOrigen");
//		processer3.setCountryOfOrigen("US");
//		processer3.setHertz("314GHZ");
//		
		
		
		Object processer = ctx.getBean("p1");
		Object processer2 = ctx.getBean("p2");

		System.out.println(processer.hashCode());
		System.out.println(processer2.hashCode());

		
//		Laptop laptop = ctx.getBean(Laptop.class);
//		laptop.setBrand("Dell");
//		laptop.setPrice(4000);
//		
//		
//		System.out.println(laptop);

	}
}
