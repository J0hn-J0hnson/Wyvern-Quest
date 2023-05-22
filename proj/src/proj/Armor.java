package proj;

import java.util.Random;

public class Armor extends Item implements GetDetails {
	private int item_defense;
	private static String[] name_list = 
		{
				"Mail",
				"Plate",
				"Scale",
				"Lamellar",
				"Half-Plate",
				"Gambeson"
		};
	
	public int get_item_defense() {
		return item_defense;
	}
	
	public void getDetails() {
		System.out.println("Armor = " + name + "\n" + "defense = " + item_defense);
	}
	Armor(int player_lvl){
		Random rand = new Random();
		item_defense = player_lvl + rand.nextInt(player_lvl);
		name = name_list[rand.nextInt(5)];
	}
}
