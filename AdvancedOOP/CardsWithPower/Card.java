package CardsWithPower;

public class Card {
    private CardsSuit cardSuits;
    private CardRank cardRank;
    private int power;


    public Card(CardsSuit cardSuits, CardRank cardRank) {
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }

    public CardsSuit getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardsSuit cardSuits) {
        this.cardSuits = cardSuits;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public int getPower() {
        return this.cardSuits.getSuitPower() + this.cardRank.getPowerRank();
    }

    public void setPower(int power) {
        this.power = power;
    }
}
