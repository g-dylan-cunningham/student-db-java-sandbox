package studentDb;

public class StudentDBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDB stud1 = new StudentDB("Sarah", "445819456");
		
		stud1.enroll("history302");
		stud1.enroll("math401");
		stud1.checkBalance();
		stud1.pay(2800);
		stud1.enroll("java101");
		stud1.showCourses();
		stud1.setCity("Tempe");
		stud1.setState("AZ");
		stud1.setPhone("4802349876");
		System.out.println(stud1.toString());
		
		StudentDB stud2 = new StudentDB("Michelle", "442349823");
		stud2.setCity("Scottsdale");
		stud2.setState("AZ");
		stud2.setPhone("6023413454");
		stud2.enroll("Bio202");
		System.out.println(stud2);
	}

}
