package com.adiwal.api.controller

import com.adiwal.api.domain.Comment
import com.adiwal.api.domain.CommentThread
import com.adiwal.api.service.CommentThreadService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(val commentThreadService: CommentThreadService) {

    @PostMapping("/comment/{id}/reply")
    fun replyToComment(@PathVariable("id") id: String, @RequestBody comment: Comment): CommentThread {
        return commentThreadService.replyToCommentThread(id, comment)
    }
}