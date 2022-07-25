package com.company;

public class Card {

    private long number;
    private int pin;
    private long balance;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Card(long number, int pin, long balance){
        this.number = number;
        this.pin = pin;
        this.balance = balance;
    }
}
