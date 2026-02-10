package com.justinharrington.open_lobby.dto;

public class CommentResponse {

    private String id;
    private String text;
    private String platform;

    public CommentResponse(String id, String text, String platform) {
        this.id = id;
        this.text = text;
        this.platform = platform;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getPlatform() {
        return platform;
    }
}
