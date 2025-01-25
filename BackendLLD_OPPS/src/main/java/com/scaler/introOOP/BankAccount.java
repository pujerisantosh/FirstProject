package com.scaler.introOOP;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public double balance;
    public String ownerName;
    private ArrayList<String> transactionHistory = new ArrayList<>();



    public BankAccount(){
        balance = 0;
        ownerName = "";

    }

    public BankAccount(String ownerName1, double balance1){
        balance = balance1;
        ownerName = ownerName1;

    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   public void deposite(double amoount){
        if(amoount > 0){
            balance = balance + amoount;
            transactionHistory.add("deposited $ " + amoount );
        }
    }

    public  void withdraw(double amount){
        if(amount > 0 && balance >= amount){
 balance = balance - amount;
 transactionHistory.add("withdraw $ " + amount);
        }


        }

    public void printTransactionHistory(){
        for ( String transaction : transactionHistory){
            System.out.println(transaction);
        }

    }
}
