package com.justinharrington.open_lobby.dto;

public class MeResponse {
    private String user;
    private String state;

    public MeResponse(String user, String state) {
        this.user = user;
        this.state = state;
    }

    public String getUsername() {
        return user;
    }

    public String getStatus() {
        return state;
    }
}
