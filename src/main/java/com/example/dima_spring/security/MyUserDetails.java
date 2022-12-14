package com.example.dima_spring.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyUserDetails implements UserDetails {

    private final com.example.dima_spring.model.MyUserDetails myUserDetails;

    public MyUserDetails(com.example.dima_spring.model.MyUserDetails myUserDetails) {
        this.myUserDetails = myUserDetails;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.myUserDetails.getPassword();
    }

    @Override
    public String getUsername() {
        return this.myUserDetails.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    // Нужно, чтобы получать данные аунтифицированого пользователя
    public com.example.dima_spring.model.MyUserDetails getMyUser(){
        return this.myUserDetails;
    }
}
