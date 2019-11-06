package com.ibm.fsd.service;

import com.ibm.fsd.entity.TUser;

import java.util.List;

public interface UserService {
    List<TUser> findAll();

    TUser findByEmail(String email);

    void save(TUser tUser);
}
