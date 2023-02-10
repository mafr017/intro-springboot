package com.mafr.messageservice.service;

import com.mafr.messageservice.entity.MessageEntity;

import java.util.List;

public interface MessageService {
    List<MessageEntity> getAll();

    MessageEntity create(MessageEntity messageEntity);

    void delete(Long id);
}
