package SpringJavaBasedConfig;

import org.springframework.stereotype.Component;

@Component
public class Display {
	public Display(String brand, String pixel) {
		super();
		this.brand = "hardSamsung";
		this.pixel = "1080p";
	}

	String brand;
	String pixel;

	@Override
	public String toString() {
		return "Display [brand=" + brand + ", pixel=" + pixel + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = "hardSamsung";
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = "1080p";
	}
}
