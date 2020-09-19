package com.adiwal.api.repository

import com.adiwal.api.domain.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@RepositoryRestResource(path = "user", collectionResourceRel = "user", itemResourceRel = "user")
interface UserRepository : MongoRepository<User, String> {
}