package com.mafr.messageservice.dto;

import com.mafr.messageservice.entity.TypeItemEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CostumerDto {
    private String name;
    private String item;
//    @Enumerated(EnumType.STRING)
    private TypeItemEnum typeItem;
}
