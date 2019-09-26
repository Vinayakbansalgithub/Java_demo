package Lamda;

interface Stringfub {

	String func(String str);
}

public class LamdaAsArg {

	static String StringOperation(Stringfub sf, String s) {

		return sf.func(s);

	}

	static String StringOperation2(String s) {

		String ss = s.toUpperCase();
		return ss;

	}

	public static void main(String[] args) {
		var strd = "Hello Vinayak Bansal";
		String result = StringOperation((str) -> str.toUpperCase(), strd);
		String result2 = StringOperation(LamdaAsArg::StringOperation2, strd);
		System.out.println(result);
		System.out.println(result);

	}

}
