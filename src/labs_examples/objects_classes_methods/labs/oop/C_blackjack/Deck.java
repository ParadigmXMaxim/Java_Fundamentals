package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
public class Deck {
    public Card[] cards;
    public ArrayList<Integer> usedCards;

    public Deck(){
        this.cards = new Card[52];
        this.usedCards = new ArrayList<Integer>();
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        int cardCounter = 0;
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <= 13; y++){
               deck.cards[cardCounter]  = new Card(y);

               cardCounter++;
            }
        }

        //System.out.println(deck.cards[x]);
        for(int n = 0; n < deck.cards.length;n++){
            System.out.println(deck.cards[n].getCardValue());
        }
    }
}
