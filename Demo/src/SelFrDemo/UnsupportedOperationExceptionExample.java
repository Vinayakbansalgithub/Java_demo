package SelFrDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class UnsupportedOperationExceptionExample {

	private final static int TOTAL_ELEMS = 10;

	private final static Random random = new Random();

	public static void main(String[] args) {

		Collection integers = new HashSet(TOTAL_ELEMS);

		// Fill the collection with some random values.

		for (int i = 0; i < TOTAL_ELEMS; ++i)

			integers.add(random.nextInt());

		Collection unmodifiableCollection = Collections
				.unmodifiableCollection(integers);
		System.out.println("values are " + unmodifiableCollection);
		// This statement throws an UnsupportedOperationException.

		unmodifiableCollection.add(random.nextInt());

	}
}
