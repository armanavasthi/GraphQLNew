package com.arman.learnGraphQL.service;

import java.util.List;
import java.util.Set;

import com.arman.learnGraphQL.model.Winner;

public interface WinnerService {
	List<Winner> getAllWinners();
	Winner getWinnerById(int id);
	Winner saveWinner(Winner winner);
	List<Winner> saveMultipleWinners(Set<Winner> winners);
	boolean deleteWinner(int id);
}
