package gün3;

public class StudentManager extends UserManager{
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Sayin ögrencimiz " + user.getName() + " kursa kaydiniz tamamlanmıştır!");
	}

}
