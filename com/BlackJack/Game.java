package com.BlackJack;

import java.util.Random;
import java.util.*;
public class Game {
    Player players_arr [] = new Player[4];
   public  Card  [][] allcards = new Card [4][13];
   public  Card [] deck = new Card[52];
   public int high_score =0;
    Random rand = new Random();
    Scanner sc1= new Scanner(System.in);
    Scanner sc2= new Scanner(System.in);
    Scanner sc3= new Scanner(System.in);
    
    void generate_card_deck()
    {
        for (int suit=0; suit<4 ; suit++ )
        {
            for(int rank = 0; rank <13 ; rank ++)
            {
                if(rank<10)
                {
                    allcards [suit][rank]= new Card(suit,rank,rank+1);
                       
                }
                else
                {
                    allcards [suit][rank]=new Card(suit,rank,10);
                }
                deck[suit*13+rank]=allcards[suit][rank];
            }
        }
       
               }   
       
 
    
  public   Card  get_rand_card()
    {
        while (true)
        {
        int randchoice =rand.nextInt(52);
        
        if(deck[randchoice]!=null)
           {
            Card c = new Card(0,0,0);
            c = deck[randchoice];
            deck[randchoice]=null;
            return c;
            }
        }
       
    }
      
 public void add_players()
 {
     System.out.println("enter the name of the firt player");
     String player1_name=sc1.nextLine();
     Player p1 = new Player();
     p1.setName(player1_name);
    p1.add_card(get_rand_card());
    p1.add_card(get_rand_card());
    players_arr[0]=p1;
    
     System.out.println("enter the name of the second player");
     String player2_name=sc2.nextLine();
     Player p2 = new Player();
     p2.setName(player2_name);
    p2.add_card(get_rand_card());
    p2.add_card(get_rand_card());
    players_arr[1]=p2;
    
     System.out.println("enter the name of the third player");
     String player3_name=sc3.nextLine();
     Player p3 = new Player();
     p3.setName(player3_name);
     p3.add_card(get_rand_card());
     p3.add_card(get_rand_card());
     players_arr[2]=p3;
    

   
     Player p4 = new Player();
     p4.setName("dealer");
    p4.add_card(get_rand_card());
    p4.add_card(get_rand_card());
    players_arr[3]=p4;
    update_maximum_score(p1.getScore(),p2.getScore(),p3.getScore(),p4.getScore());
 } 
 void update_maximum_score(int n1,int n2,int n3,int n4 )
 
 {
     if (n1>21)
         n1=0;
     if (n2>21)
         n2=0;
      if (n3>21)
         n3 =0;
     if (n4>21)
         n4 = 0;
     
   if (n1 > n2 && n1 > n3 && n1 > n4)
        high_score=n1;
   else if (n2 > n1 && n2 > n3 && n2 > n4)
       high_score=n2;
   else if (n3 > n1 && n3 > n2 && n3 > n4)
        high_score=n3;
   else if (n4 > n1 && n4 > n2 && n4 > n3)    
        high_score=n4;
 }
 
    
}
