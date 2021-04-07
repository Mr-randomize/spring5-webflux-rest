package com.iviberberi.spring5webfluxrest.repositories;

import com.iviberberi.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
