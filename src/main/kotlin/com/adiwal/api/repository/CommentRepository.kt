package com.adiwal.api.repository

import com.adiwal.api.domain.BlogPost
import com.adiwal.api.domain.Comment
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "comment", collectionResourceRel = "comment", itemResourceRel = "comment")
interface CommentRepository : MongoRepository<Comment, String> {
}