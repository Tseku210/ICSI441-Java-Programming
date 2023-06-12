package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Account {
    private static Semaphore semaphore = new Semaphore(1);
    private List<Integer> balance = new ArrayList<>();

    List<Integer> synBalance = Collections.synchronizedList(balance);

    public int getBalance() {
        int balance = 0;
        synchronized(synBalance) {
            for (Integer integer : synBalance) {
                balance += integer;
            }
        }

        return balance;
    }
    public void deposit(int amount) {
        synchronized(synBalance) {
            synBalance.add(amount);
        }
    }
}
