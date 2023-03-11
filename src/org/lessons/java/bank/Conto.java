package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    private int code;
    private String userName;
    private double balance;

    public Conto() {
        balance = 0;
        Random code = new Random();

        this.code = (code.nextInt(999)) + 1;
    }

    public int getCode() {
        return code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        if (withdraw < this.balance) {
            this.balance -= withdraw;
        } else {
            System.out.println("Denaro insufficiente, preleva una somma inferiore!");
        }
    }

    public String getFormattedBalance() {
        return new DecimalFormat("0.00€").format(getBalance());
    }
}
