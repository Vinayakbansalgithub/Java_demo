package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {

	static List<Student> myclass = new ArrayList<>();

	String name;
	int std;
	String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public Student(String name, int std) {
		super();
		this.name = name;
		this.std = std;
		myclass.add(this);
	}

	public static List<Student> getByStd(int std) {
		return myclass.stream().filter(obj -> obj.getStd() == std).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", nationality=" + nationality + "]";
	}

}

public class Streams {
	public static void main(String[] args) {

		// 1. array to stream

		String arr[] = { "vinayak", "mehul" };
		Stream.of(arr);

		// 2. list to stream

		List<String> list = Arrays.asList(arr);
		list.stream();

		// 3. print list
		list.stream().forEach(System.out::println);

		// 4. uppercase
		list.stream().forEach(s -> System.out.println(s.toUpperCase()));

		// map
		// map() produces a new stream after applying a function to each element of the
		// original stream.
		// he new stream could be of different type.
		list = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		list.stream().forEach(System.out::println);

		Student s1 = new Student("vinayak", 9);
		Student s2 = new Student("Rahullllll", 10);
		Student s3 = new Student("Mehul", 9);
		Student s4 = new Student("KK", 9);
		Student s5 = new Student("Anshul", 9);

		System.out.println("----uniqueStd");

		// remember whit below our list change form Student object to int
		List<Integer> uniqueStd = Stream.of(s1, s2, s3, s4, s5).map(obj -> obj.getStd()).distinct()
				.collect(Collectors.toList());
		uniqueStd.stream().forEach(System.out::println);

		System.out.println("----uniqueElements");

		System.out.println("----==============");

		for (Integer ustd : uniqueStd) {
			Student obj = Stream.of(s1, s2, s3, s4, s5).filter((res) -> res.getStd() == ustd).findFirst().get();
			System.out.println(obj);

		}

		System.out.println("--=====end======--");

		System.out.println("----");

		Integer[] std = { 9, 10 };

		List<List<Student>> employeesInAllStd = Stream.of(std).map(a -> Student.getByStd(a))
				.collect(Collectors.toList());

		employeesInAllStd.forEach(System.out::println);

		System.out.println("--after flat--");

		List<Student> studentFlatStream = employeesInAllStd.stream().flatMap(Collection::stream)
				.collect(Collectors.toList());

		studentFlatStream.forEach(System.out::println);

		System.out.println("--reduce--11111");
		// Many times, we need to perform operations where a stream reduces to single
		// resultant value,
		// for example, maximum, minimum, sum, product, etc. Reducing is the repeated
		// process of combining all elements.
		Optional<Student> longestName = studentFlatStream.stream()
				.reduce((w1, w2) -> w1.getName().length() > w2.getName().length() ? w1 : w2);

		if (longestName.isPresent())
			System.out.println(longestName.get());

// Creating list of integers
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

// Finding sum of all elements
		int sum = array.stream().reduce(0, (element1, element2) -> element1 + element2);

		System.out.println("sum is " + sum);

		System.out.println("--setting salutation--");

		// this is better that for each we can return result in this
		Stream.of(s1, s2, s3, s4, s5).peek(e -> e.setName("Mr " + e.getName())).peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println("--sort by name--");

		// tmap convert student to string here
		List<String> sortedStudent = Stream.of(s1, s2, s3, s4, s5).map(Student::getName).sorted()
				.collect(Collectors.toList());
		sortedStudent.forEach(System.out::println);

// here Student object is sorted in list

		List<Student> sortedStudent2 = Stream.of(s1, s2, s3, s4, s5)
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

		sortedStudent2.forEach(System.out::println);

		System.out.println("--foreach without assign--");

		Stream.of(s1, s2, s3, s4, s5).forEach(obj -> obj.setNationality("Indian"));

		System.out.println(s1);

		// set some value for each element
		Stream.of(s1, s2, s3, s4, s5).parallel().forEach(obj -> obj.setNationality("IND"));
		System.out.println(s1);

		// set some value for each element
		List<Student> ninethStudents = Stream.of(s1, s2, s3, s4, s5).filter(obj -> obj.getStd() == 9)
				.collect(Collectors.toList());
		System.out.println(ninethStudents);

		Optional<Student> first = Stream.of(s1, s2, s3, s4, s5).findFirst();

		if (first.isPresent())
			System.out.println("your are just first in the list " + first.get().getName());

		// We saw how we used collect() to get data out of the stream. If we need to get
		// an array out of the stream,
		// we can simply use toArray():
		Student[] newStudentList = Stream.of(s1, s2, s3, s4, s5).toArray(Student[]::new);

		System.out.println("--IntStream.range--");

		Optional<Student> s = Stream.of(s1, s2, s3, s4, s5).filter(obj -> obj.getStd() == 9).findAny();
		System.out.println(s.get());

	}
}
