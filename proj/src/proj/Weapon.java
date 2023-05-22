package proj;

import java.util.Random;

public class Weapon extends Item implements GetDetails {
	private int item_attack;
	private static String[] name_list = 
		{
				"Sword",
				"Spear",
				"Mace",
				"Great Sword",
				"Axe",
				"Pickaxe"
		};
	
	public int get_item_attack() {
		return item_attack;
	}
	
	public void getDetails() {
		System.out.println("Weapon = " + name + "\n" + "attack = " + item_attack);
	}
	
	Weapon(int player_lvl){
		Random rand = new Random();
		item_attack = player_lvl + rand.nextInt(player_lvl*2);
		name = name_list[rand.nextInt(5)];
	}
}
