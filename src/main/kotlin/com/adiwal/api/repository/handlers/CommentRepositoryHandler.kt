package com.adiwal.api.repository.handlers

import com.adiwal.api.domain.BlogPost
import com.adiwal.api.domain.CommentThread
import com.adiwal.api.service.BlogPostService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.HandleBeforeSave
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component


@Slf4j
@Component
@RepositoryEventHandler
class CommentRepositoryHandler {

    @Autowired
    private lateinit var blogPostService: BlogPostService

    @HandleBeforeCreate
    @HandleBeforeSave
    fun beforeCreate(commentThread: CommentThread) {
        val blogPost: BlogPost = blogPostService.findById(commentThread.blogPostId) // look if blogpost exists
    }
}
