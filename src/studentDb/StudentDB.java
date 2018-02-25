package studentDb;

public class StudentDB {
	// CLASS ATTRIBUTES
	private static int id = 1000;
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
		
		email = name.toLowerCase() + id + "." + "@losAlamos.edu";
		String randomNum = getRandom() + "";
		this.userId = id + randomNum + SSN.substring(5);
		id++;
	}
	
	// CLASS METHODS
	private int getRandom() {
		//	get random int between 1000 - 9000
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min) + min);
//		if(random > 1000 && random < 9000) {
//			return random;
//		} else {
//			return getRandom();
//		}
		return random;
	}
	
	public void enroll(String className) {
		// add class to classes array
		for(int i = 0; i < classes.length; i++) {
			if(classes[i] == null) {
				classes[i] = className;
				break;
			}
		}
		balance = balance + 500;
		System.out.println("You are now enrolled in " + className + ".\nPlease pay your balance of " + balance);
	}
	
	public void pay(int payment) {
		// reduces balance, prints payment and balance
		balance = balance - payment;
		System.out.println("A payment for " + payment + " has been made.\nYour current balance is: " + balance);
	}
	
	public void checkBalance() {
		// prints current balance
		System.out.println("Your current balance is " + balance);
	}
	
	@Override
	public String toString() {
		// returns basic student info
		return "\n[ Name: " + name + " ]\n[ SSN: " + SSN + " ]\n[ UserId: " + userId + " ]\n[ " + city + " " + state + " " + phone + " " + email + " ]\n[ Institue: " + school + " ]";
		
	}
	
	public void showCourses() {
		// prints all currently enrolled courses
		System.out.print("You are currently enrolled in:");
		for(int i = 0; i < classes.length; i++) {
			if (classes[i] != null) {
				System.out.print(" " + classes[i]);
			}
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
