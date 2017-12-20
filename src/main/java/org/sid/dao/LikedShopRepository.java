package org.sid.dao;

import org.sid.entities.LikedShop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikedShopRepository extends MongoRepository<LikedShop, String>, LikedShopRepositoryCustom {

}
