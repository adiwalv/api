package com.adiwal.api.domain

import org.springframework.data.annotation.*
import java.util.*


data class BlogPost(@Id var id: String?,
                    var name: String,
                    @CreatedBy val user: String?,
                    @LastModifiedBy val lastModifiedUser: String?,
                    @CreatedDate val createdDate: Date?,
                    @LastModifiedDate val lastModifiedDate: Date?)

data class Comment(@Id var id: String?,
                   var text: String,
                   var blogPostId: String,
                   @CreatedBy val user: String?,
                   @LastModifiedBy val lastModifiedUser: String?,
                   @CreatedDate val createdDate: Date?,
                   @LastModifiedDate val lastModifiedDate: Date?)