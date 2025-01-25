package com.scaler.introOOP;

public class  Client{

    public static void main(String [] args){

        Student student1 = new Student();

        student1.age = 29;
        student1.name ="Santosh";
        student1.course = "Computer Engineering";
        student1.gradYear = 2018;

        student1.printDetails();


        BankAccount bankAccount = new BankAccount();
        bankAccount.ownerName = "santosh";
        bankAccount.balance = 800000000;
        bankAccount.deposite(20000);
        bankAccount.withdraw(5000);

        bankAccount.printTransactionHistory();




    }





}
