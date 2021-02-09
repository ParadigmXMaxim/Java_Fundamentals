package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    final char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private int cardValue;

    public Card(int value){
        this.cardValue = value;
    }


    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char[] getSuit() {
        return suit;
    }

    public int getCardValue() {
        return cardValue;
    }
}
