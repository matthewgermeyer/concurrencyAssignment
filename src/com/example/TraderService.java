package com.example;

import java.util.List;

public interface TraderService {

    void addShares(String stockName, int numShares, int price);
    Stock getStock(String stockName);
    Trade buyShares(String traderName, String stockName, int numShares, int price) throws SharesException;
    void clearStocks();
    List<Trade> getTrades();
}
