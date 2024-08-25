package com.deploy.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.deploy.user.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
