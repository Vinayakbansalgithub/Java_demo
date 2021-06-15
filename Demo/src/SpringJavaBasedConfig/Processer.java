package SpringJavaBasedConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// PoJO
public class Processer {
	public Processer(String name, String countryOfOrigen, String hertz) {
		
		super();
		System.out.println("Processer constructor is called");
		this.name = name;
		this.countryOfOrigen = countryOfOrigen;
		this.hertz = hertz;
	}

	@Override
	public String toString() {
		return "Processer [name=" + name + ", countryOfOrigen=" + countryOfOrigen + ", hertz=" + hertz + "]";
	}

	String name;
	String countryOfOrigen;
	String hertz;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfOrigen() {
		return countryOfOrigen;
	}

	public void setCountryOfOrigen(String countryOfOrigen) {
		this.countryOfOrigen = countryOfOrigen;
	}

	public String getHertz() {
		return hertz;
	}

	public void setHertz(String hertz) {
		this.hertz = hertz;
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct is called in Processer");
	}
	
	@PreDestroy
	private void shutdown() {
		System.out.println("Shutdown All Resources");
	}
}
