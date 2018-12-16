package com.arman.learnGraphQL.resolver;

import org.springframework.stereotype.Component;

import com.arman.learnGraphQL.model.Award;
import com.arman.learnGraphQL.model.Winner;
import com.arman.learnGraphQL.service.AwardService;
import com.arman.learnGraphQL.service.WinnerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	private AwardService awardService;
	private WinnerService winnerService;

	public Query(AwardService awardService, WinnerService winnerService) {
		// this constructor is must otherwise Query class object will be initialized
		// with default constructor and winner, award services will be unknown to it.
		this.awardService = awardService;
		this.winnerService = winnerService;
	}

	public Iterable<Award> getAllAwards() {
		return awardService.getAllAwards();
	}

	public Iterable<Winner> getAllWinners() {
		return winnerService.getAllWinners();
	}

	public Award getAward(int id) {
		return awardService.getAwardById(id);
	}

	public Winner getWinner(int id) {
		return winnerService.getWinnerById(id);
	}

}
