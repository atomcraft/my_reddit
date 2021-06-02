package com.my.reddit.controller;

import com.my.reddit.dto.CommentsDto;

import static org.junit.jupiter.api.Assertions.*;

class CommentsControllerTest {

    @org.junit.jupiter.api.Test
    void createComment() {
        CommentsDto commentsDto = new CommentsDto();
        String response = commentsDto.toString("Test commentsDto");
        assertEquals("Test", response);
    }

    @org.junit.jupiter.api.Test
    void getAllCommentsForPost() {
    }

    @org.junit.jupiter.api.Test
    void getAllCommentsForUser() {
    }
}