package com.ibm.fsd.service;

import com.ibm.fsd.dto.TUser;
import com.ibm.fsd.dto.UserInfoDto;

public interface AuthService {
    void register(TUser registerUser);

    UserInfoDto checkToken(String token);
}
