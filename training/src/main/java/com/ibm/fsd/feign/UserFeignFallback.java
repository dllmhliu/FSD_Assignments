package com.ibm.fsd.feign;

import com.ibm.fsd.dto.TUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public ResponseEntity<TUser> findByEmail(String email) {
        return null;
    }
}
