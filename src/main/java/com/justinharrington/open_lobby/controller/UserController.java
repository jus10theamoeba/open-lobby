package com.justinharrington.open_lobby.controller;
import com.justinharrington.open_lobby.dto.MeResponse;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/api/me")
    public MeResponse me() {
        return new MeResponse("Justin", "online");
    }
}
