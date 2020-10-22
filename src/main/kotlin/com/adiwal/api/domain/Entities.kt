package com.adiwal.api.domain

import com.adiwal.commons.audit.Audit
import org.springframework.data.annotation.Id


data class BlogPost(@Id var id: String?,
                    var blogName: String,
                    var blogContent: String) : Audit()

data class Comment(var commentContent: String) : Audit()

data class CommentThread(@Id var id: String?,
                         var commentContent: String,
                         var blogPostId: String,
                         var children: MutableList<Comment>?) : Audit() {
    fun addComment(comment: Comment) {
        if (children == null) {
            children = mutableListOf()
        }
        children?.add(comment)
    }
}