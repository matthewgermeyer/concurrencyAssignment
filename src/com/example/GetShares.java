package com.example;

/**
 * Created by MattyG on 4/19/17.
 */
public class GetShares implements Runnable {

    private TraderServiceImpl traderServiceImpl;

    public GetShares(TraderServiceImpl traderServiceImpl) {
        this.traderServiceImpl = traderServiceImpl;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(traderServiceImpl.getStock("ABC"));
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }

}
