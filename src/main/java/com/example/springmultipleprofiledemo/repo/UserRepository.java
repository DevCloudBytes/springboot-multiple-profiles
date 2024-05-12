package com.example.springmultipleprofiledemo.repo;

import com.example.springmultipleprofiledemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


}
