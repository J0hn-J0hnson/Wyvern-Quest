package proj;

import java.util.Random;
import java.util.Scanner;

public abstract class Character implements GetDetails {
	protected int max_hp;
	protected int hp;
	protected int attack;
	protected int defense;
	protected Weapon weapon;
	protected Armor armor;
	protected int lvl;
	protected int defeated_enemies;
	protected int ed;
	
	
	void set_weapon(Weapon item) {
		if(weapon != null) {
			attack -= weapon.get_item_attack();
		}
		weapon = item;
		attack += weapon.get_item_attack();
	
	}
	void set_armor(Armor item) {
		if(armor != null) {
			defense -= armor.get_item_defense();
		}
		armor = item;
		defense += armor.get_item_defense();
	}
	
	@Override
	public void getDetails(){
		System.out.println("Player | lvl: " + lvl + "\nhp = " + hp + "/" + max_hp + "\nattack: " + attack + " | defense: " + defense );
		if(weapon != null) {
			weapon.getDetails();
		}
		if(armor != null) {
			armor.getDetails();
		}
	}
	public abstract void lvl_up();
	
	public void generate() {
		System.out.println("Your journey begins!\nReach level 10 to win!");
//		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		int choice2 = -1;
		do {
			System.out.println("\n");
			getDetails();
			System.out.println("\n");
			Random rand = new Random();
			int rc = rand.nextInt(9) + 1;
			if(rc == 1) {
				System.out.println("You come upon a weapon!");
				Weapon new_weapon = new Weapon(lvl);
				new_weapon.getDetails();
				System.out.println("Pick up new weapon? (y/n)");
				char cc= '-';
				while(cc != 'y' && cc != 'n') {
					cc = sc.next().charAt(0);
					if(cc == 'y') set_weapon(new_weapon);
					else if(cc == 'n') System.out.println("You ignored the weapon");
					else System.out.println("input invalid");
				}
			}else if(rc == 2) {
				System.out.println("You spot a set of armor");
				Armor new_armor = new Armor(lvl);
				new_armor.getDetails();
				System.out.println("Pick up armor? (y/n)");
				char cc= '-';
				while(cc != 'y' && cc != 'n') {
					cc = sc.next().charAt(0);
					if(cc == 'y') set_armor(new_armor);
					else if(cc == 'n') System.out.println("You ignored the armor");
					else System.out.println("input invalid");
				}
			}else {
				Foe foe = new Foe(lvl);
				System.out.println("You encountered a Foe!");
				foe.getDetails();
				int damage = 0;
				while(foe.get_hp() > 0 && hp > 0) {
					System.out.println("you attacked the foe!");
					damage = attack - foe.get_defense();
					if(damage <= 0) damage = 1;
					System.out.println("You dealt " + damage + " damage.");
					foe.set_hp(foe.get_hp()-damage);
					if(foe.get_hp() <= 0) {
						System.out.println("The foe has been defeated!");
						defeated_enemies++;
						ed++;
						if(defeated_enemies == 2 * lvl) {
							defeated_enemies = 0;
							lvl_up();
							System.out.println("You have leveled up!");
						}
					}
					else {
						System.out.println("you have been attacked by the foe!");
						damage = foe.get_attack() - defense;
						if(damage <= 0) damage = 1;
						hp = (hp - damage);
						System.out.println("The foe dealt " + damage+ " damage.");
						if(hp <= 0) {
							System.out.println("You have been defeated!");
							break;
						}
					}
				}
			}
			if(hp <= 0) break;
			if(lvl == 10) {
				System.out.println("You Won!");
			}
			System.out.println("\n1.Continue\n2.Quit");
			choice2 = sc.nextInt();
			while(choice2 != 1 && choice2 != 2) {
				System.out.println("Invalid Choice\n1.Continue\n2.Quit");
				choice2 = sc.nextInt();
			}
		}while(choice2 != 2);	
		System.out.println("\nYou defeated " + ed + " foes!\n");
	}
}