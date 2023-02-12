package com.mafr.messageservice.controller;

import com.mafr.messageservice.dto.CostumerDto;
import com.mafr.messageservice.entity.PersonEntity;
import com.mafr.messageservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public PersonEntity create(@RequestBody CostumerDto costumerDto) {
        return itemService.create(costumerDto);
    }

    @GetMapping
    public List<PersonEntity> getByID(@RequestParam String name) {
        return itemService.findByName(name);
    }
}
