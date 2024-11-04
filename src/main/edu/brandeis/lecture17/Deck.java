package edu.brandeis.lecture17;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> draw;
    private ArrayList<Card> discard;
    private Random rand;
        
    public Deck() {
        draw = new ArrayList<Card>();
        discard = new ArrayList<Card>();
        
        String[] suits = new String[]{"spades", "clubs", "diamonds", "hearts"};
        for(int i = 0; i < 13; i++) {
            for(int j = 0; j < suits.length; j++) {
                draw.add(new Card(i+1, suits[j]));
            }
        }
        rand = new Random();
        
        shuffle();
    }
    
    public void shuffle() {
        for(int i = draw.size() - 1; i > 0; i--) {
            int swap = rand.nextInt(i + 1);
            if(swap != i) {
                Card tmp = draw.get(swap);
                draw.set(swap, draw.get(i));
                draw.set(i, tmp);
            }
        }
    }
    
    public Card drawNextCard() {
        if(draw.isEmpty()) {
            draw = new ArrayList<Card>(discard);
            discard = new ArrayList<Card>();
            shuffle();
        }
        return draw.remove(draw.size() - 1);
    }
    
    public void discard(Card c) {
        discard.add(c);
    }
}