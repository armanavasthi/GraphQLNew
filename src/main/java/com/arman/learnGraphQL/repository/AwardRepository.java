package com.arman.learnGraphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arman.learnGraphQL.model.Award;

@Repository
public interface AwardRepository extends JpaRepository<Award, Integer> {

}
