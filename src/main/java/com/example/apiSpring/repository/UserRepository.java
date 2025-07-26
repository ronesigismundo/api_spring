package com.example.apiSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.apiSpring.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {


}
