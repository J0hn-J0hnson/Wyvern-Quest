package proj;

import java.util.Random;

public class Foe implements GetDetails{
		private int hp;
		private int attack;
		private int defense;

		int get_hp() {
			return hp;
		}
		
		int get_attack() {
			return attack;
		}
		
		int get_defense() {
			return defense;
		}
		
		void set_hp(int val) {
			hp = val;
		}
		
		@Override
		public void getDetails() {
			System.out.println("Foe\nHp: "+ hp +" | attack: " + attack + " | defense: " + defense);
		}
		Foe(int player_lvl){
			Random rand = new Random();
			hp = player_lvl*5 + rand.nextInt(player_lvl * 10);
			defense = player_lvl*2 + rand.nextInt(player_lvl * 2);
			attack = player_lvl*2 + rand.nextInt(player_lvl * 3);
		}
}
