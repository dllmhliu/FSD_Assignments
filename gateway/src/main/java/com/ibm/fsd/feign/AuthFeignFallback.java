package com.ibm.fsd.feign;

import com.ibm.fsd.dto.UserInfoDto;
import org.springframework.stereotype.Component;

@Component
public class AuthFeignFallback implements AuthFeign {
    @Override
    public UserInfoDto checkToken(String token) {
        return null;
    }
}
