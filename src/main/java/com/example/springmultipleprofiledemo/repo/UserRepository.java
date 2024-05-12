package com.example.springmultipleprofiledemo.repo;

import com.example.springmultipleprofiledemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
