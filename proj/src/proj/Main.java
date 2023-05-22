package proj;
import java.util.Scanner;
//import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.println("\n╭╮╭╮╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━╮╱╱╱╱╱╱╱╱╭╮\r\n"
					+ "┃┃┃┃┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭━╮┃╱╱╱╱╱╱╱╭╯╰╮\r\n"
					+ "┃┃┃┃┃┣╮╱╭┳╮╭┳━━┳━┳━╮╱┃┃╱┃┣╮╭┳━━┳━┻╮╭╯\r\n"
					+ "┃╰╯╰╯┃┃╱┃┃╰╯┃┃━┫╭┫╭╮╮┃┃╱┃┃┃┃┃┃━┫━━┫┃\r\n"
					+ "╰╮╭╮╭┫╰━╯┣╮╭┫┃━┫┃┃┃┃┃┃╰━╯┃╰╯┃┃━╋━━┃╰╮\r\n"
					+ "╱╰╯╰╯╰━╮╭╯╰╯╰━━┻╯╰╯╰╯╰━━╮┣━━┻━━┻━━┻━╯\r\n"
					+ "╱╱╱╱╱╭━╯┃╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯\r\n"
					+ "╱╱╱╱╱╰━━╯\n");
			System.out.println("--Menu--\n1.Select Character\n2.Exit");
			choice = sc.nextInt();
			// print choices
			if(choice == 2) break;
			else if(choice == 1) {
				// print choices
				System.out.println("\n--Character Selection--");
				System.out.println("1.Warrior\n2.Rogue\n3.Mage\n4.Back");
				int choice2 = sc.nextInt();
//				Character pc;
				int flag = 0;
				switch(choice2) {
					case 1:
						 Warrior wpc = new Warrior();
						 wpc.generate();
						break;
					case 2:
						Rogue rpc = new Rogue();
						rpc.generate();
						break;
					case 3:
						Mage mpc = new Mage();
						mpc.generate();
						break;
					case 4:
						flag = 1;
						break;
					default:
						flag = 1;
						break;
				}
				if(flag == 1) continue;
			}
		}
	}
}
