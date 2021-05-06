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
		System.out.println("Sisteme kayd�n�z yap�lm��t�r: " + gamer.getFirstName());
		}

		
	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Bilgileriniz g�ncellenmi�tir " + gamer.getFirstName());
	
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayd�n�z sistemden silinmi�tir! " + gamer.getFirstName());
		
	}

	
}
