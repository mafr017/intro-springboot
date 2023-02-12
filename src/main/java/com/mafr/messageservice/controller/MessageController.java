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

    @GetMapping("/{id}")
    public MessageEntity getByID(@PathVariable Long id) {
        return messageService.getByID(id);
    }

    @PostMapping
    public MessageEntity create(@RequestBody MessageEntity messageEntity) {
        return messageService.create(messageEntity);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        messageService.delete(id);
        return "Success delete message id " + id;
    }

    @PutMapping
    public MessageEntity update(@RequestBody MessageEntity messageEntity) {
        return messageService.update(messageEntity);
    }
}
