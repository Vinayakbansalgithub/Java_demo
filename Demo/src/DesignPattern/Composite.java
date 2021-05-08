package DesignPattern;

import java.util.ArrayList;
import java.util.List;

interface File {
	String name();

	String permission();

	int size();

	String contentType();
}

class RegularFile implements File {

	String name;
	String permission;

	int size;

	String contentType;

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String permission() {
		// TODO Auto-generated method stub
		return this.permission;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String contentType() {
		// TODO Auto-generated method stub
		return this.contentType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public RegularFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "RegularFile [name=" + name + ", permission=" + permission + ", size=" + size + ", contentType="
				+ contentType + "]";
	}

}

class Directory implements File {

	String name;
	String permission;
	int size;
	String contentType;
	List<File> subFiles = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setSubFiles(List<File> subFiles) {
		this.subFiles = subFiles;
	}

	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String permission() {
		// TODO Auto-generated method stub
		return this.permission;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String contentType() {
		// TODO Auto-generated method stub
		return this.contentType;
	}

	boolean hasSubFiles() {
		if (this.subFiles.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", permission=" + permission + ", size=" + size + ", contentType="
				+ contentType + ", subFiles=" + subFiles + "]";
	}

}


// his is known as a “has-a” relationship between objects.
public class Composite {

	public static void main(String[] args) {
		Directory dir1 = new Directory("programming");
		RegularFile file1 = new RegularFile("Theory Notes");
		Directory dir2 = new Directory("Java");
		List<File> f1 = new ArrayList<File>();
		f1.add(dir2);
		f1.add(file1);
		dir1.setSubFiles(f1);
		Directory dir3 = new Directory("Java 8");
		List<File> f2 = new ArrayList<File>();
		f2.add(dir3);
		dir2.setSubFiles(f2);

		RegularFile file2 = new RegularFile("MultiThreading");
		RegularFile file3 = new RegularFile("Streams");

		List<File> f3 = new ArrayList<File>();
		f3.add(file2);
		f3.add(file3);

		dir3.setSubFiles(f3);
		
		
		System.out.println(dir1);

	}

}

//The Composite Pattern is a Structural Pattern that allows us to treat a group of objects the same way
//as a single instance of the object.
//
//This design pattern is a structural pattern and
//uses recursive composition to abstract the complexities involved in managing individual as well as composition of objects.
//After applying the design pattern, the client can treat both types of object uniformly.


//Consequences of this pattern
//
//Since the primitive objects can be composed into more complex objects and so on recursively, wherever client code expects a primitive object, it can also take a composite object
//Clients can treat the Component and Composite classes uniformly and hence the client code becomes simple. Clients should normally not bother if they are dealing with a component or composite. This pattern avoid unnecessary branches in the client code
//New components can be added without disturbing the client code. The client code can work as usual with the new component and makes your design general


//
//When not to use Composite Design Pattern?
//
//	    Composite Design Pattern makes it harder to restrict the type of components of a composite. 
//	    So it should not be used when you don’t want to represent a full or partial hierarchy of objects.
//	    
//	    
//	    Composite Design Pattern can make the design overly general. It makes harder to restrict 
//	    the components of a composite. Sometimes you want a composite to have only certain components. 
//	    With Composite, you can’t rely on the 
//	    type system to enforce those constraints for you. Instead you’ll have to use run-time checks.
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    