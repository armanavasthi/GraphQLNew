package com.arman.learnGraphQL.resolver;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arman.learnGraphQL.model.Award;
import com.arman.learnGraphQL.model.Winner;
import com.arman.learnGraphQL.service.AwardService;
import com.arman.learnGraphQL.service.WinnerService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
	@Autowired
	private AwardService awardService;

	@Autowired
	private WinnerService winnerService;

	// name must be newAward() because graphQL will search by default for newAward()
	// or getNewAward() only
	public Award newAward(String name, String field, String country) {
		Award award = new Award();
		// award.setId(id);
		award.setName(name);
		award.setCountry(country);
		award.setField(field);
		System.out.println("New Award: " + award);
		return awardService.saveAward(award);
	}

	public Boolean deleteAward(int id) {
		return awardService.deleteAward(id);
	}

	// argument order must be same as inside the mutation in schema file.
	public Winner newWinner(String firstName, String lastName, String country, String field, Set<Award> awards) {
		Winner winner = new Winner();
		
		winner.setFirstName(firstName);
		winner.setLastName(lastName);
		winner.setCountry(country);
		winner.setField(field);
		
		awardService.saveMultipleAwards(awards);
		winner.setAwards(awards);
		System.out.println("Winner is:      =====>    " + winner);
		return winnerService.saveWinner(winner);
	}

	public Boolean deleteWinner(int id) {
		return winnerService.deleteWinner(id);
	}

}
