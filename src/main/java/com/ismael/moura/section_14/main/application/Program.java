package com.ismael.moura.section_14.main.application;

import com.ismael.moura.section_14.main.entities.Account;
import com.ismael.moura.section_14.main.entities.BusinessAccount;
import com.ismael.moura.section_14.main.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account (1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
