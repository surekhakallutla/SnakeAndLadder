package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder{
	
	public static void main (String[] args)
	{
		
		System.out.println("Welcome to Snake And Ladder Program");
		
		int position = 0;
		
		System.out.println("Player is starting at position is " +position);
		
		int DiceValue = rollDice();
		
		System.out.println("The Dice Value is "+DiceValue);
		
		   
				
	}
	
	public static int rollDice()
	{
	    Random r = new Random();
	    int n=r.nextInt(6)+1;
	    return (n);
	   
	}	
	
	
	
}
