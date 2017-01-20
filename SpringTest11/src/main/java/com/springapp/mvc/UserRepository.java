package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nosochol on 2017. 1. 19..
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
