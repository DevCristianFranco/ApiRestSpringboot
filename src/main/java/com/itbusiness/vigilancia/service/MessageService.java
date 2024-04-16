package com.itbusiness.vigilancia.service;

import com.itbusiness.vigilancia.service.DTO.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private static List<DeviceMessage> messages;

    private MessageResponse getFinalMessage() {
        List<String> secret = messages.get(0).getMessage();
        for (int i = 1; i < messages.size(); i++) {
            for(int j = 0; j < secret.size(); j++) {
                if("".equals(secret.get(j))){
                    secret.set(j, messages.get(i).getMessage().get(j));
                }
            }
        }
        MessageResponse response = new MessageResponse(String.join(" ", secret), !secret.contains(""));
        return response;
    }

    public ResponseEntity<OutputMessage> ReciveMessages(InputDevices input) {
        try {
            messages = new ArrayList<>();
            messages.addAll(input.getDevices());
            OutputMessage output = new OutputMessage();
            MessageResponse response = getFinalMessage();
            output.setMessage(response.isComplete() ? response.getMessage() : "No hay suficiente información");
            messages = new ArrayList<>();
            return new ResponseEntity<OutputMessage>(output, response.isComplete() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<OutputMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity ReciveMessage(DeviceMessageId input, int id) {
        try {
            if(messages == null)
                messages = new ArrayList<>();
            DeviceMessage deviceMessage = new DeviceMessage();
            deviceMessage.setId(id);
            deviceMessage.setMessage(input.getMessage());
            messages.add(deviceMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<OutputMessage> GetMessage() {
        try {
            OutputMessage output = new OutputMessage();
            MessageResponse response = getFinalMessage();
            output.setMessage(response.isComplete() ? response.getMessage() : "No hay suficiente información");
            messages = new ArrayList<>();
            return new ResponseEntity<OutputMessage>(output, response.isComplete() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<OutputMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
