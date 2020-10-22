package com.adiwal.api.config

import com.adiwal.api.domain.BlogPost
import com.adiwal.api.domain.CommentThread
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

@Configuration
class RepositoryConfig : RepositoryRestConfigurerAdapter() {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.exposeIdsFor(BlogPost::class.java)
        config.exposeIdsFor(CommentThread::class.java)
    }
}
