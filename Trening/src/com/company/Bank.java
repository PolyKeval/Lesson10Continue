package com.company;

public class Bank {

    private static Card[] cards;

    static {
        cards = new Card[]{
                new Card(9191, 1111, 21111),
                new Card(3232, 1234, 44333),
                new Card(7676, 0000, 24444)};

    }

    public boolean isCardExist(long cardNumber) {
        for (Card card : Bank.cards) {
        if (cardNumber == card.getNumber()){
            return true;
            }
        }
       return false;
    }

    public boolean checkPin(long cardNumber, int pin){
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumber()){
                return pin == card.getPin();
            }
        }
        return false;
    }

    public long changeBalance(long cardNumber, long amount){
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumber()){
                long balance = card.getBalance() - amount;
                if (balance < 0){
                    System.out.println("Недостаточно средств");
                }else {
                    card.setBalance(balance);
                }
                return card.getBalance();
            }
            }
        return 0;
    }

    public long getCardBalance( long cardNumber){

        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumber()){
                return card.getBalance();
            }
        }
        return 0;
      }
    }


















