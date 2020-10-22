package com.adiwal.api.repository

import com.adiwal.api.domain.CommentThread
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "comment", collectionResourceRel = "comment", itemResourceRel = "comment")
interface CommentThreadRepository : MongoRepository<CommentThread, String> {

    fun findByBlogPostId(@Param("id") blogPostId: String, pageable: Pageable): Page<CommentThread>
}