package com.example.dima_spring.service;

import com.example.dima_spring.model.MyUserDetails;
import com.example.dima_spring.repository.MyUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final MyUserDetailsRepository myUserDetailsRepository;

    @Autowired
    public MyUserDetailsService(MyUserDetailsRepository myUserDetailsRepository) {
        this.myUserDetailsRepository = myUserDetailsRepository;
    }

    @Override
    public com.example.dima_spring.security.MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUserDetails> myUserDetails = myUserDetailsRepository.findByUserName(username);
        if (myUserDetails.isEmpty()) {
            throw new UsernameNotFoundException("qweqweqwe");
        }

        return new com.example.dima_spring.security.MyUserDetails(myUserDetails.get());
    }

    public List<MyUserDetails> findAll(){
        return myUserDetailsRepository.findAll();
    }

    public MyUserDetails findById(Long id){
        Optional<MyUserDetails> myUserDetails = myUserDetailsRepository.findById(id);
        if(myUserDetails.isEmpty()){
            throw new UsernameNotFoundException("User not found");
        }
        return myUserDetails.get();
    }

    public MyUserDetails saveMyUserDetails(MyUserDetails myUserDetails){
        return myUserDetailsRepository.save(myUserDetails);
    }
}
