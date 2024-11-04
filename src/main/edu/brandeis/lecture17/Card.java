package edu.brandeis.lecture17;

public class Card {
    
    private int value;
    private String suit;
    
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSuit() {
        return suit;
    }
    
    @Override
    public String toString() {
        return value + " of " + suit;
    }
    
    public int compareTo(Card other) {
        return value > other.value ? 1 : (value < other.value ? -1 : 0);
    }
    
}