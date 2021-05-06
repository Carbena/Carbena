package Concrete;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService,GamerCheckService {
	
	@Override
	public void checkGamer(Gamer gamer) {
		System.out.println("Bilgileriniz kontrol edildi " + gamer.getFirstName());
		
	}
		
		@Override
	public void add(Gamer gamer) {
		checkGamer(gamer);
		System.out.println("Sisteme kaydýnýz yapýlmýþtýr: " + gamer.getFirstName());
		}

		
	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Bilgileriniz güncellenmiþtir " + gamer.getFirstName());
	
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kaydýnýz sistemden silinmiþtir! " + gamer.getFirstName());
		
	}

	
}
