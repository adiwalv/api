package com.adiwal.api.service

import com.adiwal.api.domain.Comment
import com.adiwal.api.domain.CommentThread
import com.adiwal.api.repository.CommentThreadRepository
import com.adiwal.api.utils.ApiUtils
import org.joda.time.DateTime
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class CommentThreadService(val commentThreadRepository: CommentThreadRepository) {

    fun findById(id: String): CommentThread {
        return commentThreadRepository.findById(id).orElseThrow { ResourceNotFoundException("Comment Thread with" + id + "not found") }
    }

    fun save(commentThread: CommentThread): CommentThread {
        return commentThreadRepository.save(commentThread)
    }

    fun replyToCommentThread(id: String, comment: Comment): CommentThread {
        val commentThread = findById(id)
        comment.createdBy = ApiUtils.getCurrentUserName()
        comment.lastModifiedBy = ApiUtils.getCurrentUserName()
        commentThread.addComment(comment)
        return save(commentThread)
    }
}