package com.ibm.fsd.feign;

import com.ibm.fsd.dto.TUser;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public TUser findByEmail(String email) {
        return null;
    }

    @Override
    public void save(TUser registerUser) {

    }
}
