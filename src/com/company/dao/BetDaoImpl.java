package com.company.dao;

import com.company.db.Storage;
import com.company.lib.Dao;
import com.company.model.Bet;

import java.util.List;

@Dao
public class BetDaoImpl implements BetDao {
    @Override
    public void addBet(Bet bet) {
        Storage.BETS.add(bet);
    }

    @Override
    public List<Bet> getAllBet() {
        return Storage.BETS;
    }
}
