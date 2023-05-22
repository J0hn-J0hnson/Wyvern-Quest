package proj;

public class Rogue extends Character{
	
	@Override
	public void lvl_up() {
		max_hp += 4;
		attack += 7;
		defense += 1;
		hp = max_hp;
		lvl++;
				
	}
	Rogue(){
		max_hp = 40;
		hp = max_hp;
		attack = 15;
		defense = 4;
		lvl = 1;
		defeated_enemies = 0;
		ed = 0;
	}
}