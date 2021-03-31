package com.vjezba1;

import com.vjezba1.bank.AccountService;
import com.vjezba1.bank.Bank;
import com.vjezba1.bank.BankService;

public class Main {

    public static void main(String[] args) {

        BankService bankService = Bank.requestBankService(); //Request bank service (same as you'd go to banks website)
        bankService.register("John", "hero", 100);
        bankService.register("Smith", "superHero", 100);
        try
        {
            AccountService john = bankService.logIn("John", "hero");
            AccountService smith = bankService.logIn("Smith", "superHero");
            System.out.println(john.getName() + " has " + john.getAvailableMoney() + "$");
            System.out.println(smith.getName() + " has " + john.getAvailableMoney() + "$");
            smith.transfer(john.getName(), 50);
            System.out.println(john.getName() + " has " + john.getAvailableMoney() + "$");
            System.out.println(smith.getName() + " has " + smith.getAvailableMoney() + "$");
            //Now lets try to transfer too large amount of money
            john.transfer(smith.getName(), 200);

        } catch (Exception e)
        {
            //In real world banking, manny problems could happen when you use its services.
            //I've put all exceptions in one place. You shouldn't do this in real programs.
            System.err.println("\u001B[31m" + e.getMessage() + "\u001B[00m");
        }


    }


}







