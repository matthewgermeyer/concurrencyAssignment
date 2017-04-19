package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraderServiceImpl implements TraderService {

    private Map<String, Stock> stocks = new HashMap<>();
    private List<Trade> trades = new ArrayList<>();

    public synchronized void addShares(String stockName, int numShares, int price) {
        Stock stock = stocks.get(stockName);
        //if stock does not exist..
        if (stock == null) {
            //create the stock
            Stock stock1 = new Stock(stockName, price, numShares);
            //add it to the map 'stocks'
            stocks.put(stockName, stock1);
        } else {
            //System.out.println("in the else..");
            // increment number of shares for the stock
            int newNumofShares = numShares + stock.getSharesAvailable();
            Stock stock1 = new Stock(stockName, price, newNumofShares);
            stocks.put(stockName, stock1);
        }
        //System.out.println(stocks);
    }

    @Override
    public synchronized Stock getStock(String stockName) {
        return stocks.get(stockName);
    }

    @Override

    public Trade buyShares(String traderName, String stockName, int numShares, int price) throws SharesException {

        // get the stock from the map...  stocks.get(stockName)
        // if null
        // throw shares exception
        // else
        // if stock has enough shares to sell.
        //Throw shares exception
        // do the math for the purchase of shares ( - ), and put finished numshares back into map

        /*
         int sharesAfterpurchase = stock.getSharesAvailable() - sharesToPurchase;
            Stock stock1 = new Stock(stockName, newNumofShares, price);
            stocks.put(stockName, stock1);
         */

//        LocalDateTime timeOfTrade = LocalDateTime.now();
//        Trade trade = new Trade(traderName, price, sharesAfterPurchase, stockName, timeOfTrade);
//        trades.add(trade);
        return null;
 //make this trades later


    }

    @Override
    public void clearStocks() {
        stocks.clear();

    }

    @Override
    public List<Trade> getTrades() {
        return trades;


    }

    @Override
    public String toString() {
        return "TraderServiceImpl{" +
                "stocks=" + stocks +
                '}';
    }
}
