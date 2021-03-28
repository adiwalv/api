package com.adiwal.api.service

import com.adiwal.api.domain.Comment
import com.adiwal.api.domain.CommentThread
import com.adiwal.api.repository.CommentThreadRepository
import com.adiwal.api.utils.ApiUtils
import org.joda.time.DateTime
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.stereotype.Service
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
        val apiUtils = ApiUtils()
        comment.createdBy = apiUtils.getCurrentUserName()
        comment.lastModifiedBy = apiUtils.getCurrentUserName()
        comment.createdDate = DateTime()
        comment.lastModifiedDate = DateTime()
        commentThread.addComment(comment)
        return save(commentThread)
    }
}