package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum){
        System.out.println("Вы положили на счет сумму в размере: " + sum);
        return amount = amount + sum;
    }

    public int withDraw(int sum) throws LimitException {

        if (sum > amount) {
            throw new LimitException("У вас на счете недостаточно денег, ваш текущий счет ", amount);
        }
        System.out.println("Вы сняли со счета сумму в размере: " + sum);
        return (int) (amount = amount - sum);
    }
}
