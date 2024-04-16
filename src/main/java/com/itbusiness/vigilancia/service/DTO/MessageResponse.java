package com.itbusiness.vigilancia.service.DTO;

public class MessageResponse {
    private String message;
    private boolean isComplete;

    public MessageResponse(String message, boolean isComplete) {
        this.message = message;
        this.isComplete = isComplete;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
