package SelFrDemo;

class Mycar {
	final void prime() {

		System.out.println("car");
	}

}

class HondaCity extends Mycar {
	final int k = 5;

	 static void HondaCity() {
		final int k = 8;
	}

	   void prime() {

		final byte b;

		System.out.println("car hondacity");
	}

	public static void main(String[] args) {

		Mycar car = new HondaCity();

		car.prime();

	}

}
