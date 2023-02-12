package com.mafr.messageservice.service.implementation;

import com.mafr.messageservice.dto.CostumerDto;
import com.mafr.messageservice.entity.ItemEntity;
import com.mafr.messageservice.entity.PersonEntity;
import com.mafr.messageservice.repository.ItemRepository;
import com.mafr.messageservice.repository.PersonRepository;
import com.mafr.messageservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final PersonRepository personRepository;
    private final ItemRepository itemRepository;

    @Override
    public PersonEntity create(CostumerDto costumerDto) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(costumerDto.getName());
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setItem(costumerDto.getItem());
        itemEntity.setType(costumerDto.getTypeItem());

        personEntity.setItemEntity(itemEntity);
        itemEntity.setPersonEntity(personEntity);

        personRepository.save(personEntity);
        itemRepository.save(itemEntity);
        return personEntity;
    }

    @Override
    public List<PersonEntity> findByName(String name) {
        return personRepository.findByName(name);
    }
}
