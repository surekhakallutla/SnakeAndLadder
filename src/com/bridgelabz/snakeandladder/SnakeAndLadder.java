package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder{
	
//	static int currentposition = 0;
	static int count = 1;
	static final int Winposition = 100;
	static int p1position = 0;
	static int p2position = 0;
	static int p1currentposition = 0;
	static int p2currentposition = 0;
	
	public static void main (String[] args)
	{
		
		System.out.println("Welcome to Snake And Ladder Program");
				
		
		
		while (p1currentposition <= Winposition && p2currentposition <= Winposition)
		{
			if(count%2 !=0)
			{
				System.out.println("Player 1 is Playing:");
				p1position = player1position();		
				p1currentposition = p1position;
			
			}
			
			else
			{
				System.out.println("Player 2 is Playing");
				p2position = player2position();
				p2currentposition = p2position;
			}
			
			if(p1position <= Winposition || p2position <= Winposition)
				count++;
			if( p1position == Winposition || p2position == Winposition)
				break;
			System.out.println("Player1 Position = "+p1currentposition);
			System.out.println("Player2 Position = "+p2currentposition);
		}
		System.out.println("P1Position "+p1position);
		System.out.println("P2Position "+p2position);
		
		if(p1position > p2position)
			System.out.println("Player 1 Won the Game");
		else if(p1position < p2position)
			System.out.println("Player 2 Won the Game");
		else
			System.out.println("The match is Draw");
		
	   System.out.println("The No. of times the dice was rolled to Win the Game is "+count);
		    
	}
	
	public static int rollDice()
	{
	    Random r = new Random();
	    int n=r.nextInt(6)+1;
	    return (n);
	   
	}	
	
	public static int player1position()
	{
			int DiceValue = rollDice();
						
			System.out.println("The Dice Value is "+DiceValue);
			
			if(DiceValue == 6)
			{
				int a = rollDice();
				
				System.out.println("The Dice Value is "+a);
				DiceValue = DiceValue + a;
			}
			
			Random r = new Random();
		    int opt = r.nextInt(3);
    
		    switch(opt)
		    {
		    
		    case 0:
		    	
		    	p1position = p1currentposition;
		    	System.out.println("The Player is not Playing"); 
		    	break;
		    	
		    case 1:
		    	
		    	p1position = p1currentposition + DiceValue;
		    	
		    	System.out.println("The Player got Ladder and got chance to roll the dice again");
		    	
		    	int x = rollDice();
		    	System.out.println("The Dice Value is "+x);
		    	
		    	int p1extraposition = p1position + x;
		    	
		    	p1position = p1extraposition;
		    	
		    	if(p1position > Winposition)
					p1position = p1currentposition;
		    	
				
		    	
		    	break;
		    	
		    default:
		    	
		    	p1position = p1currentposition - DiceValue;
		    	if (p1position  < 0)
		    		p1position = 0;
		    	System.out.println("The Player got Snake ");
		    	
		    }
			  		   
		p1currentposition=p1position;
	   	return(p1currentposition);
	}
	
	public static int player2position()
	{
			int DiceValue = rollDice();
						
			System.out.println("The Dice Value is "+DiceValue);
			
			if(DiceValue == 6)
			{
				int b = rollDice();
				
				System.out.println("The Dice Value is "+b);
				DiceValue = DiceValue + b;
			}
			
			Random r = new Random();
		    int opt = r.nextInt(3);
    
		    switch(opt)
		    {
		    
		    case 0:
		    	
		    	p2position = p2currentposition;
		    	System.out.println("The Player is not Playing"); 
		    	break;
		    	
		    case 1:
		    	
		    	p2position = p2currentposition + DiceValue;
		    	
		    	System.out.println("The Player got Ladder and got chance to roll the dice again");
		    	
		    	int x = rollDice();
		    	System.out.println("The Dice Value is "+x);
		    	
		    	int p2extraposition = p2position + x;
		    	
		    	p2position = p2extraposition;
		    	
		    	if(p2position > Winposition)
					p2position = p2currentposition;
		    	
				
		    	
		    	break;
		    	
		    default:
		    	
		    	p2position = p2currentposition - DiceValue;
		    	if (p2position  < 0)
		    		p2position = 0;
		    	System.out.println("The Player got Snake ");
		    	
		    }
			  		   
		p2currentposition=p2position;
	   	return(p2currentposition);
	}
	
	
}