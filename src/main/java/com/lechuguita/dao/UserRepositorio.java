package com.lechuguita.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lechuguita.entities.User;

@Repository
public interface UserRepositorio extends JpaRepository<User, Long>{

}
