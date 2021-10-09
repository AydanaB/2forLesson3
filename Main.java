package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage() + bankAccount.getAmount());;
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
            System.out.println("Ваш счет: " + bankAccount.getAmount());
        }
    }
}
