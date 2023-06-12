package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallablePrime implements Callable<List<Integer>> {

    public static boolean isPrime(int n) {
        int i,m=n/2;

        if(n==0||n==1) {
            return false;
        } else {
            for(i=2;i<=m;i++) {
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }
}