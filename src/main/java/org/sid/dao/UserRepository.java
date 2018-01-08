package org.sid.dao;

import org.sid.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>,UserRepositoryCustom {

}
