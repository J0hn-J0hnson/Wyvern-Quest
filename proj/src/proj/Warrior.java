package proj;

public class Warrior extends Character{
	
	@Override
	public void lvl_up() {
		max_hp += 8;
		attack += 3;
		defense += 2;
		hp = max_hp;
		lvl++;
				
	}
	Warrior(){
		max_hp = 60;
		hp = max_hp;
		attack = 8;
		defense = 8;
		lvl = 1;
		defeated_enemies = 0;
		ed = 0;
	}
}