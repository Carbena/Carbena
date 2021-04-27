package javaKamp;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Course course1 = new Course(01, "Yazılım Geliştirici Yetiştirme Kampı(C# + ANGULAR)", "Kampımız 2 ay sürecek ve ücretsizdir", "Engin Demiroğ");
		
		Course course2 = new Course(02, "Yazılım Geliştirici Yetiştirme Kampı(Java + REACT)", "Kampımız 2 ay sürecek ve ücretsizdir" ,"Engin Demiroğ");
		
		Course course3 = new Course(03, "Programlamaya Giriş için Temel Kurs", "Ücretsizdir", "Engin Demiroğ");
		
		
		Course[] courses = {course1,course2,course3};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Adınız:");
		
		Student ogrenci = new Student(input.next());
		
		
		
		
		System.out.println("Hangi Kursa Katılmak istersiniz?");
		
		for(Course course : courses) {
			
			System.out.println(course.id + " " + course.name + " " + course.acıklama  + " " + "(Eğitmen: " + course.hoca + ")");
		}
		
		
		CourseManager manager = new CourseManager();
		
		switch(input.nextInt()) {
		
		case 1:
			
			manager.joinCourse(ogrenci, course1);
			break;
		case 2:
			
			manager.joinCourse(ogrenci, course2);
			break;
		
		case 3:
			
			manager.joinCourse(ogrenci, course3);
		}
		
		
	}


}
