package com.example.dima_spring.repository;

import com.example.dima_spring.model.MyUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyUserDetailsRepository extends JpaRepository<MyUserDetails, Long> {

    Optional<MyUserDetails> findByUserName(String userName);

}
