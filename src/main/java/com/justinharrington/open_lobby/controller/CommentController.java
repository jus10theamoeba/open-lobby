package com.justinharrington.open_lobby.controller;
import com.justinharrington.open_lobby.dto.CommentResponse;
import com.justinharrington.open_lobby.dto.CreateCommentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final List<CommentResponse> comments = new CopyOnWriteArrayList<>();

    @PostMapping
    public CommentResponse create(@RequestBody CreateCommentRequest req) {
        String id = UUID.randomUUID().toString();
        CommentResponse created =  new CommentResponse(id, req.getText(), req.getPlatform());
        comments.add(created);
        return  created;
    }

    @GetMapping
    public List<CommentResponse> getAll() {
        return comments;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentResponse> getByID(@PathVariable String id) {

        for (CommentResponse c : comments) {
            if (c.getId().equals(id)) {
                return ResponseEntity.ok(c);
            }
        }

        return ResponseEntity.notFound().build();


    }
}
