package com.revature.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.User;
@Repository
public interface LeaderboardRepo extends CrudRepository<User,Integer>{
	
}