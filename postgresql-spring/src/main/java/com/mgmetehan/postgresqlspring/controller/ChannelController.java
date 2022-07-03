package com.mgmetehan.postgresqlspring.controller;

import com.mgmetehan.postgresqlspring.model.Channel;
import com.mgmetehan.postgresqlspring.service.ChannelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/channel")
public class ChannelController {
    private ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Channel> getChannelById(@PathVariable("id") Long id) {
        Channel channel = channelService.getChannelById(id);
        return ResponseEntity.ok(channel);
    }

    @PostMapping
    public ResponseEntity<?> createChannel(@Valid @RequestBody Channel newChannel) {
        return new ResponseEntity<>(channelService.createChannel(newChannel), HttpStatus.CREATED);
    }
}
