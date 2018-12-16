package com.arman.learnGraphQL.service;

import java.util.List;
import java.util.Set;

import com.arman.learnGraphQL.model.Award;

public interface AwardService {
	List<Award> getAllAwards();
	Award getAwardById(int id);
	Award saveAward(Award award);
	List<Award> saveMultipleAwards(Set<Award> awards);
	boolean deleteAward(int id);
}
