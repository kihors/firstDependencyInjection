package com.company.dao;

import com.company.model.Bet;

import java.util.List;

public interface BetDao {
    void addBet(Bet bet);

    List<Bet> getAllBet();
}
