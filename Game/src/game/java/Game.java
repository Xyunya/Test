
package game.java;

import java.util.*;

public class Game {

    public static void main(String[] args) {
        
       int N=0;
       
       Scanner scan = new Scanner(System.in);
       
       for (int i=1; i<2; i++)
                {
                System.out.println("Введите кол-во игроков: ");
                N = scan.nextInt();
                if (N >= 2) {continue;}
                System.out.println("Игроков должно быть не меньше двух: ");
                i--;
                }
       
     
      Player[] players = new Player[N];
      for (int i = 0; i < N ; i++)
                 {
			players[i] = new Player();
			System.out.println("Введите имя игрока " + (i+1));
			players[i].setName(scan.next());
		}
 
      
      
     int t=0;
       System.out.println("Введите кол-во кубиков: ");
     Kosti dice = new Kosti();
		dice.setAmount(scan.nextInt());
		boolean win = false;
		do{
			t++;
			System.out.println("\nTurn №" + (t) + ":");
			for (int i = 0; i < N ; i++){
				players[i].Turn(dice);
			}
			players = players[0].Sort(players, N);
			System.out.println(players[0].getName() + " won!");
			players[0].setWins();
			if (players[0].getWins() == 7) win = true;
		}while(win == false);
		for (int i = 0; i < N ; i++)
		System.out.println(players[i].getName()+ "'s total wins:" + players[i].getWins());
		scan.close();
	}
}