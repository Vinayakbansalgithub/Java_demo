package SpringJavaBasedConfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Laptop implements InitializingBean, DisposableBean{
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processer=" + processer + ", display=" + null + "]";
	}

	String brand;
	int price;
	@Autowired
	// @Qualifier(value = "getProcesor3")
	Processer processer;
//	@Autowired
//	Display display;
//
//	public Display getDisplay() {
//		return display;
//	}
//
//	public void setDisplay(Display display) {
//		this.display = display;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Processer getProcesser() {
		return processer;
	}

	public void setProcesser(Processer processer) {
		this.processer = processer;
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct is called in Laptop");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy====");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet====");

		
	}
}
