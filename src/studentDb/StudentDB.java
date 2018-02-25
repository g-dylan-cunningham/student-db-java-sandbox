package studentDb;

public class StudentDB {
	// CLASS ATTRIBUTES
	private int id = 1000;
	public String userId;
	private String SSN;
	public String name;
	private String phone;
	private String city;
	private String state;
	private String[] classes;
	private int balance = 0;
	
	// CLASS CONSTRUCTORS
	public StudentDB() {
		// Generate a user ID that is combination of Static ID, random 
		// 4-digit number between 1000 and 9000, and last 4 of SSN
	}
	
	// CLASS METHODS
	public void enroll() {
		// add class to classes array
	}
	
	public void pay() {
		// reduces balance, prints payment and balance
	}
	
	public void checkBalance() {
		// prints current balance
	}
	
	@Override
	public String toString() {
		// returns basic student info
		return "";
		
	}
	
	public void showCourses() {
		// prints all currently enrolled courses
	}
}
