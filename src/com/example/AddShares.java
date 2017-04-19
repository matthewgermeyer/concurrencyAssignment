package com.example;

/**
 * Created by MattyG on 4/19/17.
 */
public class AddShares implements Runnable {
    private TraderServiceImpl traderServiceImpl;

    public AddShares(TraderServiceImpl traderServiceImpl) {
        this.traderServiceImpl = traderServiceImpl;
    }

    @Override
    public void run() {
        while (true) {
            traderServiceImpl.addShares("ABC", 10, 42);
            System.out.println("after adding shares " + traderServiceImpl);

            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }


}
