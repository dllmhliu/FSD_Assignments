package com.ibm.fsd.service.impl;

import com.ibm.fsd.dto.JwtUser;
import com.ibm.fsd.feign.UserFeign;
import com.ibm.fsd.dto.TUser;
import com.ibm.fsd.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserFeign userFeign;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TUser tUser = userFeign.findByEmail(username);
        User user = new User();
        user.setRole(tUser.getRole());
        user.setUsername(tUser.getEmail());
        user.setPassword(tUser.getPwd());
        user.setId(tUser.getId());
        return new JwtUser(user);
    }

}
