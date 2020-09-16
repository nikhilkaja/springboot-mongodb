package com.citi.mongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.citi.mongodb.model.TTDataDictionaryEvar;

@Repository
public interface TTDataDictionaryRepository extends MongoRepository<TTDataDictionaryEvar, String> {
}