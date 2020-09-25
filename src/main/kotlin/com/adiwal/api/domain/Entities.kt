package com.adiwal.api.domain

import com.adiwal.commons.audit.Audit
import org.springframework.data.annotation.Id


data class BlogPost(@Id var id: String?,
                    var name: String) : Audit()

data class Comment(@Id var id: String?,
                   var text: String,
                   var blogPostId: String) : Audit()