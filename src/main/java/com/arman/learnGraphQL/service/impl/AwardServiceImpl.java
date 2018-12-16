package com.arman.learnGraphQL.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arman.learnGraphQL.model.Award;
import com.arman.learnGraphQL.repository.AwardRepository;
import com.arman.learnGraphQL.service.AwardService;

@Service("awardService")
public class AwardServiceImpl implements AwardService{
	
	@Autowired
	private AwardRepository awardRepository;
	
	@Override
	public List<Award> getAllAwards(){
		return awardRepository.findAll();
	}
	
	@Override
	public Award getAwardById(int id) {
		try {
			/*return awardRepository.findById(id).get();*/ // In spring boot 2.x, findOne() is removed so we use findById() which throws NoSuchElementException.
			return awardRepository.findOne(id);
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	@Override
	public Award saveAward(Award award) {
		// note: here save() of Crud Repository automatically works as saveOrUpdate(), so if entity is already there, it will be updated
		return awardRepository.save(award);
	}
	
	@Override
	public List<Award> saveMultipleAwards(Set<Award> awards) {
		return awardRepository.save(awards);
	}
	
	@Override
	public boolean deleteAward(int id) {
		Award award = awardRepository.findOne(id);
		if (award != null) {
			awardRepository.delete(id);
			return true;
		}
		return false;
	}
}
