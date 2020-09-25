package com.adiwal.api.repository

import com.adiwal.api.domain.Comment
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(path = "comment", collectionResourceRel = "comment", itemResourceRel = "comment")
interface CommentRepository : MongoRepository<Comment, String> {

    fun findByBlogPostId(@Param("id") blogPostId: String?, pageable: Pageable): Page<Comment?>?
}