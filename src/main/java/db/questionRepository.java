package db;

import org.springframework.data.repository.CrudRepository;

import db.question;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface questionRepository extends CrudRepository<question, Integer> {

}