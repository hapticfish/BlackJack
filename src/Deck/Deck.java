package Deck;

import Players.Dealer;
import Players.Player;
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck;
    int index = 0;

    public Deck(){
        deck=new ArrayList<>();
        loadDeck();
        shuffleDeck();
    }

    public void loadDeck(){
        for(Suit s: Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(s,r));
            }
        }
    }

    public void deal1CardPlayer(ArrayList<Player> players){
        players.get(0).addCard(deck.get(index));
        index++;
    }

    public void deal1CardDealer(Dealer dealer){
        dealer.addCard(deck.get(index));
        index++;
    }

    //deal method
    public void dealCards(Dealer dealer, ArrayList<Player> players){
        // Loop through each Player, deal them two cards.
        for (int i = 0; i < players.size(); i++) {
            players.get(i).addCard(deck.get(index));
            index++;
            players.get(i).addCard(deck.get(index));
            index++;
        }

        // Deal two card to the dealer
        dealer.addCard(deck.get(index));
        index++;
        dealer.addCard(deck.get(index));
        index++;

    }


    public void shuffleDeck(){
        for(int i=0; i<deck.size()-1; i++){
            swapCardLocation(i);
        }
    }



    public void swapCardLocation(int index){
        Card tempCard=deck.get(index);
        int min=index+1, max=deck.size();
        int rand=(int)(Math.random()*(max-min))+min;
        deck.set(index, deck.get(rand));
        deck.set(rand, tempCard);

    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck
                ;
    }
}
