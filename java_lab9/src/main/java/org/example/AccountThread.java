package org.example;

import java.util.ArrayList;
import java.util.Random;

public class AccountThread implements Runnable {
    private final Account account;
    private final int amount;

    public AccountThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
        System.out.println(amount + " нэмлээ -> balance -> " + account.getBalance());
    }
}
