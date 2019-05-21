package com.ds.trainproject.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ds.trainproject.models.Train;

@RepositoryRestResource(collectionResourceRel = "trains", path = "trains")
public interface TrainRepository extends MongoRepository<Train, String>{
	
}
