package com.BlackJack;


  public class Player {
  private String Name;
  private int Score =0 ;
public Card cards_arr []=new Card[11];
  private int index=0;
  boolean won = false;
  boolean lose = false;
  
  
    void add_card (Card c)
    {
        cards_arr[index]=c;
        index++;
         Score+=c.getValue();
       
    }
   
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }


    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return Name;
    }

    public int getScore() {
        return Score;
    }


    public int getIndex() {
        return index;
    }

    
    
    
}
