package com.itbusiness.vigilancia.controller;

import com.itbusiness.vigilancia.service.DTO.DeviceMessageId;
import com.itbusiness.vigilancia.service.DTO.InputDevices;
import com.itbusiness.vigilancia.service.DTO.OutputMessage;
import com.itbusiness.vigilancia.service.MessageService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping("message/")
    @Operation(summary = "Se pueda obtener el mensaje que se emite.")
    public ResponseEntity<OutputMessage> ReciveMessages(@RequestBody InputDevices input) {
        return service.ReciveMessages(input);
    }

    @PostMapping("message_split/{device_id}")
    @Operation(summary = "Almacena los diferentes mensajes recibidos para luego armar el resultado")
    public ResponseEntity ReciveMessage(
            @PathVariable(required=true,name="device_id") int device_id,
            @RequestBody DeviceMessageId deviceMessageId) {
        return service.ReciveMessage(deviceMessageId, device_id);
    }

    @GetMapping("message_split/")
    @Operation(summary = "Responde si fue posible construir el mensaje a partir de los mensajes almacenados")
    public ResponseEntity<OutputMessage> ReciveMessage() {
        return service.GetMessage();
    }
}
