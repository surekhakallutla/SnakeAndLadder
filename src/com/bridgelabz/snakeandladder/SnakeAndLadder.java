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
		
		Random r = new Random();
	    int opt =r.nextInt(3);
	    
	    switch(opt)
	    {
	    
	    case 0:
	    	
	    	position = position;
	    	System.out.println("The Player is not Playing and is at position "+position);
	    	break;
	    	
	    case 1:
	    	
	    	position = position + DiceValue;
	    	System.out.println("The Player got Ladder and is at position "+position);
	    	break;
	    	
	    default:
	    	
	    	position = position - DiceValue;
	    	if (position  < 0)
	    		position = 0;
	    	System.out.println("The Player got Snake and is at position "+position);
	    	
	    }
	   
				
	}
	
	public static int rollDice()
	{
	    Random r = new Random();
	    int n=r.nextInt(6)+1;
	    return (n);
	   
	}	
	
	
	
}
