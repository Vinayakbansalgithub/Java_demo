package TestNg;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTestFactory {
	@Factory
    public Object[] factoryMethod() {
        return new Object[] { new FactoryTestNG(), new FactoryTestNG() };
    }
}
