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

    @Override
    public MessageEntity update(MessageEntity messageEntity) {
        MessageEntity messageEntity1 = messageRepository.findById(messageEntity.getId()).get();
        messageEntity1.setMessage(messageEntity.getMessage());
        return messageRepository.save(messageEntity1);
    }

    @Override
    public MessageEntity getByID(Long id) {
        return messageRepository.findById(id).get();
    }
}
