package gün3;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Sayın Eğitmenimiz " + user.getName() + " Kursa kaydınız tamamlanmıştır");
	}

}
