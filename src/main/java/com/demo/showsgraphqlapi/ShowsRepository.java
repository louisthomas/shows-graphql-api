package com.demo.showsgraphqlapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ShowsRepository extends MongoRepository<Show, String> {

  Optional<Show> findByTitle(String title);
}
