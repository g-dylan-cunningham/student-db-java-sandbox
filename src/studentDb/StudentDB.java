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
	private String[] classes = new String[8];
	private int balance = 0;
	private static final String school = "Los Alamos University";
	
	// CLASS CONSTRUCTORS
	public StudentDB(String name, String SSN) {
		// Generate a user ID that is combination of Static ID, random 
		// 4-digit number between 1000 and 9000, and last 4 of SSN
		this.SSN = SSN;
		this.name = name;
		
		email = name + "@losAlamos.edu";
		String randomNum = getRandom() + "";
		this.userId = id + randomNum + SSN.substring(5);
	}
	
	// CLASS METHODS
	private int getRandom() {
		//	get random int between 1000 - 9000
		int random = (int) (Math.random() * 10000);
		if(random > 1000 && random < 9000) {
			return random;
		} else {
			return getRandom();
		}
	}
	
	public void enroll(String className) {
		// add class to classes array
		for(int i = 0; i < classes.length; i++) {
			
			System.out.println("inloop " + classes[i]);
			if(classes[i] == null) {
				classes[i] = className;
				break;
			}
		}
		System.out.println(classes[0] + classes[1] + classes[2]);
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
		return "[Name: " + name + "]\n[SSN: " + SSN + "]\n [UserId: " + userId + "]";
		
	}
	
	public void showCourses() {
		// prints all currently enrolled courses
	}
}
