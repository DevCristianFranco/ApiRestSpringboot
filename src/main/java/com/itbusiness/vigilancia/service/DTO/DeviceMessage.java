package com.itbusiness.vigilancia.service.DTO;

import java.util.List;

public class DeviceMessage {
    private int id;
    private List<String> message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
