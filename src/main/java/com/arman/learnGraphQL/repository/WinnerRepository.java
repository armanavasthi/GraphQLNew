package com.arman.learnGraphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arman.learnGraphQL.model.Winner;

@Repository
public interface WinnerRepository extends JpaRepository<Winner, Integer> {

}
