package gün3;

public class Main {
	
	public static void main(String[] args) {
		

		User student = new Student(1,"ALP","gmail");
		User instcuctor = new Instructor(2,"ENGIN","hotmail");
		
		UserManager studentManager = new StudentManager();
		studentManager.add(student);
		
		UserManager instructorManager = new InstructorManager();
		instructorManager.add(instcuctor);
		
		
		
	}

}
