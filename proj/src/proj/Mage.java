package proj;

public class Mage extends Character{
	
	@Override
	public void lvl_up() {
		max_hp += 5;
		attack += 6;
		defense += 1;
		hp = max_hp;
		lvl++;
				
	}
	Mage(){
		max_hp = 50;
		hp = max_hp;
		attack = 12;
		defense = 5;
		lvl = 1;
		defeated_enemies = 0;
		ed = 0;
	}
}

