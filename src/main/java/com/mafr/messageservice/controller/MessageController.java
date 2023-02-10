package com.mafr.messageservice.controller;

import com.mafr.messageservice.entity.MessageEntity;
import com.mafr.messageservice.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping
    public List<MessageEntity> getAll() {
        return messageService.getAll();
    }

    @PostMapping
    public MessageEntity create(@RequestBody MessageEntity messageEntity) {
        return messageService.create(messageEntity);
    }

    @DeleteMapping
    public String delete(@RequestBody MessageEntity messageEntity) {
        messageService.delete(messageEntity.getId());
        return "Success delete message id" + messageEntity.getId();
    }
}
