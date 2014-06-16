/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game.java;

/**
 *
 * @author Pavel
 */
public class Player {
	private int wins, score;
	private String name;
	public Player(){wins = 0; score = 0; name = "Computer";}
	public Player(String n){wins = 0; score = 0; name = n;}
	public void setName(String n){name=n;}
	public void setWins(){ wins++;}
	public String getName(){return name;}
	public int getWins(){return wins;}
	public int Turn(Kosti d1){
		score = d1.Trow();
		System.out.println(name + "'s turn score: " + score);
		return score;
	}
	public Player[] Sort (Player[] play, int pl){
		int max = 0, m = 0, i =0;
		while(i<pl){
			if (play[i].score > max){
				max = play[i].score; m=i;				
			}
			i++;
		}
		Player buf = play[m];
			while(m>0){
				play[m] = play[m-1];
				m--;
			}
			play[0] = buf; 
		return play;
	}
}

