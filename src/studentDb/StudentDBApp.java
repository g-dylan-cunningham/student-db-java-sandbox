package studentDb;

public class StudentDBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDB stud1 = new StudentDB("Sarah", "445819456");
		
		stud1.enroll("history");
		stud1.enroll("math");
		stud1.checkBalance();
		stud1.pay(1000);
		stud1.enroll("java 101");
		stud1.showCourses();
		stud1.setCity("Tempe");
		stud1.setState("AZ");
		stud1.setPhone("4802349876");
		System.out.println(stud1.toString());
	}

}
