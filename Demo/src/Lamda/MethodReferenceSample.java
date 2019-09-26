package Lamda;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

enum Browser {
    /**
     * Android galaxys 7 browser.
     */
    ANDROID_GALAXY7,
    /**
     * Android galaxys 8 browser.
     */
    ANDROID_GALAXY8
};


class Parent{
	void print(String s) {
		System.out.println("Parent::: "+s);
	}
}class Child{
	void print(String s) {
		System.out.println("child::: "+s);
	}
}

public class MethodReferenceSample {
	int i=10;
	
	Browser readBrowser(String s) {
        try {
            return Browser.ANDROID_GALAXY7;
        } catch (Exception e) {
            return null;
        }
    };
	public static void main(String[] args) {

		
		String s = "hello";
		// Consumer con = (s) -> System.out::println;

		Consumer<String> c = System.out::println;
		c.accept(s);

		Consumer<String> cs = new Consumer<String>() {

			@Override
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);

			}
		};
		cs.accept("Hello vinayak");
		
		Supplier<MethodReferenceSample> suppliar= MethodReferenceSample::new;

		System.out.println(suppliar.get().i);
		
		
        Browser[] browsers = Browser.values();
        Browser[] browsers2 = Stream.of(browsers)
                .map(b -> "\"" + b + "\"")
                .map(suppliar.get()::readBrowser)
                .toArray(Browser[]::new);
        System.out.println(browsers2[1]);
        
        
        
        Supplier<Parent> suppliarParent = Parent::new;
        suppliarParent.get().print(s);
        		
        
	}
}
