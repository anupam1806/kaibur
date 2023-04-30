package com.anupam.kaiburr.repository;

import com.anupam.kaiburr.entities.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server,String>
{

}
