package UnderStandDependencyInjection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesModule extends AbstractModule {
	
	
	// Low level classes
	
	@Override
	public void configure() {
		try {
			Properties props = new Properties();

			FileReader reader = new FileReader(
					"/Users/vinayakbansal/eclipse-workspace/Java_demo/Demo/resources/logging.properties");
			props.load(reader);
			Names.bindProperties(binder(), props);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}