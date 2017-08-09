package com.TIYMay.Hackathon.repository;

import com.TIYMay.Hackathon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by duhlig on 8/9/17.
 */
public interface UserRepository extends JpaRepository<User, Integer>{
}
