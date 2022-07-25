package com.company;

import java.util.Scanner;

public class ATM  {
    private Bank bank;
    private Scanner sc;
    private long cardNumder;

    public ATM(Bank bank){
        this.bank = bank;
        this.sc = new Scanner(System.in);
    }

    public void start(){

        System.out.println("Введите номер карточки");
       this.cardNumder = this.sc.nextLong();
       if(!this.bank.isCardExist(this.cardNumder)){
           System.out.println("Карты не существует");
           return;
       }
       this.showPinCodeMenu();

    }

    private  void showPinCodeMenu(){
        int retriesCout = 3;
        while (retriesCout > 0) {
            System.out.println("Введите пин код. Осталось попыток :" + retriesCout);
            int pin = this.sc.nextInt();
            if (this.bank.checkPin(this.cardNumder, pin)) {
                this.showMaimMenu();
                return;
            }
            retriesCout--;
            System.out.println("Неверный пин код");
        }
        System.out.println("Карта заблокирована");
    }

    private void showMaimMenu(){
        int menuOption = 0;
        while ( menuOption  != 3){
            System.out.println("1.Показать баланс");
            System.out.println("2.Снятие наличных");
            System.out.println("3.Завершить работу");
            menuOption = sc.nextInt();
            switch (menuOption){
                case 1:
                    System.out.println("Ваш баланс: " + this.bank.getCardBalance(this.cardNumder));
                    break;
                case 2:
                    System.out.println("Введите сумму для снятия");
                    long amout = this.sc.nextLong();
                    System.out.println("Остаток :" + this.bank.changeBalance(this.cardNumder, amout));
                    break;
                case 3:
                    System.out.println("Завершение работы ");
                    break;
                default:
                    System.out.println("Некорректные данные");
            }
        }

    }
}

























