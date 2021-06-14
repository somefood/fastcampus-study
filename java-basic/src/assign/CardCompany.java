package assign;

class Card {
    static int startNumber = 10001;
    int cardNumber;
    public Card() {
        cardNumber = startNumber++;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}

public class CardCompany {
    private static CardCompany instance = null;
    private CardCompany() {}

    public static CardCompany getInstance() {
        if (instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        return new Card();
    }
}
