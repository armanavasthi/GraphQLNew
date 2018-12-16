package com.arman.learnGraphQL.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arman.learnGraphQL.model.Winner;
import com.arman.learnGraphQL.repository.WinnerRepository;
import com.arman.learnGraphQL.service.WinnerService;


@Service("winnerService")
public class WinnerServiceImpl implements WinnerService {
	
	@Autowired
	private WinnerRepository winnerRepository;
	
	@Override
	public List<Winner> getAllWinners() {
		return winnerRepository.findAll();
	}
	
	@Override
	public Winner getWinnerById(int id) {
		Winner winner = null;
		try {
			// In spring boot 2.x, findOne() is removed so we use findById() which throws NoSuchElementException.
			/* winner = winnerRepository.findById(id).get(); */
			winner = winnerRepository.findOne(id);
		} catch (NoSuchElementException e) {
			// give some logs here
		}
		return winner;
	}
	
	@Override
	public Winner saveWinner(Winner winner) {
		return winnerRepository.save(winner);
	}
	
	@Override
	public List<Winner> saveMultipleWinners(Set<Winner> winners) {
		return winnerRepository.save(winners);
	}
	
	@Override
	public boolean deleteWinner(int id) {
		Winner winner = winnerRepository.findOne(id);
		if (winner != null) {
			winnerRepository.delete(id);
			return true;
		}
		return false;
	}
	
}
