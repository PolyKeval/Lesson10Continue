package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank);
        atm.start();

    }
}
