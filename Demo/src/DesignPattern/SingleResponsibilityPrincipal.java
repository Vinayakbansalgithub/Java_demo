package DesignPattern;

class User {
	public void create(String[] data) {
		try {
			// Save User To Database
		} catch (Exception exception) {
			System.out.println(logError(exception.getMessage()));
		}
	}

	public void edit() {
//Edit User Record
	}

	public String logError(String msg) {
		// Write Error To File
		return "";
	}
}

//The point of the User Class above is to save a record to the database and if something goes wrong, 
//an error message is been logged to the file and here are the methods Create, Edit and logError
//
//Now the above class breaks the single responsibility principle because it has more than one responsibility or task, 
//and the reason for this is because of the method logError. Create and Edit Method has perfect reasons to stay in the User Class, 
//it actually performs actions upon the User but the logError does otherwise

//
//So how do we fix this?
//
//We can extract the logError method and keep it in its own class,

class Logger {
	public void writeToFile(String msg) {
		// Write To File
	}
}

//
//we can also have flexible and expandable enough for it to save to file or save to external resource so
//if we still need the LogError method then use dependency injection to inject it into the User Class

class UserSameAsAbove {
	/**
	 * @var \Logger
	 */
	Logger logger;

	public UserSameAsAbove(Logger logger) {

		this.logger = logger;
	}

	public void create(String[] data) {
		try {
			// Save User To Database
		} catch (Exception exception) {
			this.logger.writeToFile(exception.getMessage());
		}
	}

	}


	public class SingleResponsibilityPrincipal {

}
	// https://www.youtube.com/watch?v=rtmFCcjEgEw&ab_channel=LaraconEU
	
//This state that a class should have only one reason to change, in simpler terms,
//a class should only have one task or one responsibility so
//if there are any other methods in a class that deals with something completely different,
//that method should be extracted and put somewhere else and your class should have one task/job/responsibilities.
//
//Makes the class easier to maintain.
//Potentially make class reusable ( depending on whatever your class is dealing with)
//Easier to test
	
	
	
//In video we have a mvc example to save data 	

// controller to save data 
// it first check all validation
// encript password
// save data to database

// insted of doing all this in one file we can devide it into 1). validation class, 2) encrypt 3.) save to db and call from controller 
	