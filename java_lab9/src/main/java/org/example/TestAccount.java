package org.example;

import java.util.ArrayList;

public class TestAccount {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            AccountThread accountThread = new AccountThread(account, (int) (Math.random() * 10));
            threads.add(i, new Thread(accountThread));
            threads.get(i).start();
        }
        long startTime = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Amount: " + account.getBalance());
        System.out.println("Хугацаа: " + (endTime - startTime));
    }
}
