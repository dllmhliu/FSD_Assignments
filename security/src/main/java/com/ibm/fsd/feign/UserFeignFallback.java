package com.ibm.fsd.feign;

import com.ibm.fsd.dto.TUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class UserFeignFallback implements UserFeign {
    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser findByEmail(String email) {
        TUserCriteria example = new TUserCriteria();
        example.createCriteria().andEmailEqualTo(email);
        List<TUser> tUsers = tUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(tUsers)) {
            return null;
        }
        return tUsers.get(0);
    }
    @Override
    public ResponseEntity<Void> save(TUser registerUser) {
        return null;
    }
}
