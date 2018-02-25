package studentDb;

public class StudentDB {
	// CLASS ATTRIBUTES
	private int id = 1000;
	public String userId;
	private String SSN;
	public String name;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String[] classes;
	private int balance = 0;
	private static final String school = "Los Alamos Universityy";
	
	// CLASS CONSTRUCTORS
	public StudentDB(String name, String SSN) {
		// Generate a user ID that is combination of Static ID, random 
		// 4-digit number between 1000 and 9000, and last 4 of SSN
		this.SSN = SSN;
		this.name = name;
		
		email = name + "@losAlamos.edu";
		int randomNum = getRandom();
		
	}
	
	// CLASS METHODS
	private int getRandom() {
		int random = (int) (Math.random() * 10000);
		if(random > 1000 && random < 9000) {
			return random;
		} else {
			return getRandom();
		}
		
	}
	
	
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
		return "[Name: " + name + "]\n[SSN: " + SSN + "]";
		
	}
	
	public void showCourses() {
		// prints all currently enrolled courses
	}
}
