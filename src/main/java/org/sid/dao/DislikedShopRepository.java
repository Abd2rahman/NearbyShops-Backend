package org.sid.dao;

import org.sid.entities.DislikedShop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DislikedShopRepository extends MongoRepository<DislikedShop, String>,DislikedShopRepositoryCustom {

}
