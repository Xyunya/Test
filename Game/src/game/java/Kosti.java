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
public class Kosti {
    private int number, amount;
	public void setAmount(int a){amount = a;}
	public int getAmount(){return amount;}
	public int getNumber(){return number;}
	public int Trow(){
		int i = amount, sum = 0;
		do{
		number = (int)(Math.random()*5+1);
		//System.in.read();
		sum+=number;
		System.out.println("Dice = " + number);
		i--;
		}while(i > 0);
		return sum;
	}
}
