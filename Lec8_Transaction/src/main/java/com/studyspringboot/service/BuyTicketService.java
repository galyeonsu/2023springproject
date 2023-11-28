package com.studyspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyspringboot.dao.ITransaction1Dao;

@Service
public class BuyTicketService implements IBuyTicketService {

	@Autowired
	ITransaction1Dao transaction1;

	@Override
	public int buy(String consumerId, int amount, String error) {
		try {
			transaction1.pay(consumerId, amount);

			return 1;
		} catch (Exception e) {
			return 0;
		}

	}
}
