package com.ibm.fsd.service;

import com.ibm.fsd.entity.TTechnology;

import java.util.List;

public interface TechnologyService {
    List<TTechnology> findAllTechnologies();

    TTechnology findBySkillId(String skillId);
}
