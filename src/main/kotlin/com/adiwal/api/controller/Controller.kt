package com.adiwal.api.controller

import com.adiwal.api.domain.Comment
import com.adiwal.api.domain.CommentThread
import com.adiwal.api.service.CommentThreadService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class Controller(val commentThreadService: CommentThreadService) {

    @PostMapping("/reply")
    fun replyToThread(@RequestParam id: String, @RequestBody comment: Comment): CommentThread {
        return commentThreadService.replyToCommentThread(id, comment)
    }

}