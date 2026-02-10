package com.justinharrington.open_lobby.dto;

public class CreateCommentRequest {
    private String text;
    private String platform;

    public CreateCommentRequest() {

    }

    public String getText() {
        return text;
    }

    public String getPlatform() {
        return platform;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
