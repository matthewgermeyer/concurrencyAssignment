package com.example;

public class Main {
    

    public static void main(String[] args) throws InterruptedException {
        TraderServiceImpl traderServiceImpl = new TraderServiceImpl();
        AddShares addShares = new AddShares(traderServiceImpl);
        Thread thread = new Thread(addShares);
        thread.start();

        GetShares getShares = new GetShares(traderServiceImpl);
        Thread thread1 = new Thread(getShares);
        thread1.start();

    }
}
