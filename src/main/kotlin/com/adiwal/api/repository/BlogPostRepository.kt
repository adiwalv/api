package com.adiwal.api.repository

import com.adiwal.api.domain.BlogPost
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "blog", collectionResourceRel = "blog", itemResourceRel = "blog")
interface BlogPostRepository : MongoRepository<BlogPost, String> {
}