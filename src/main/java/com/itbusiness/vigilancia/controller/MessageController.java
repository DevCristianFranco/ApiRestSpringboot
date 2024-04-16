package com.itbusiness.vigilancia.controller;

import com.itbusiness.vigilancia.service.DTO.DeviceMessageId;
import com.itbusiness.vigilancia.service.DTO.InputDevices;
import com.itbusiness.vigilancia.service.DTO.OutputMessage;
import com.itbusiness.vigilancia.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping("message/")
    public ResponseEntity<OutputMessage> reciveMessages(@RequestBody InputDevices input) {
        return service.ReciveMessages(input);
    }

    @PostMapping("message_split/{device_id}")
    public ResponseEntity reciveMessage(
            @PathVariable(required=true,name="device_id") int device_id,
            @RequestBody DeviceMessageId deviceMessageId) {
        return service.ReciveMessage(deviceMessageId, device_id);
    }

    @GetMapping("message_split/")
    public ResponseEntity<OutputMessage> reciveMessage() {
        return service.GetMessage();
    }
}
