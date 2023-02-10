package com.mafr.messageservice.service.implementation;

import com.mafr.messageservice.entity.MessageEntity;
import com.mafr.messageservice.repository.MessageRepository;
import com.mafr.messageservice.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    @Override
    public List<MessageEntity> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public MessageEntity create(MessageEntity messageEntity) {
        return messageRepository.save(messageEntity);
    }

    @Override
    public void delete(Long id) {
        messageRepository.deleteById(id);
    }
}
