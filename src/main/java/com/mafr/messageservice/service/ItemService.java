package com.mafr.messageservice.service;

import com.mafr.messageservice.dto.CostumerDto;
import com.mafr.messageservice.entity.PersonEntity;

import java.util.List;

public interface ItemService {
    PersonEntity create(CostumerDto personEntity);

    List<PersonEntity> findByName(String name);
}
