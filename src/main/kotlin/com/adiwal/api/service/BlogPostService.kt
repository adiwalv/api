package com.adiwal.api.service

import com.adiwal.api.domain.BlogPost
import com.adiwal.api.repository.BlogPostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.stereotype.Service

@Service
class BlogPostService {

    @Autowired
    private lateinit var blogPostRepository: BlogPostRepository

    fun findById(id: String): BlogPost {
        return blogPostRepository.findById(id).orElseThrow { ResourceNotFoundException("Blog post with" + id + "not found") }
    }
}