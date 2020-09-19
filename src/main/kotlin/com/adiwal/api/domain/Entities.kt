package com.adiwal.api.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

data class User(@Id var id: String?,
                var name: String,
                @CreatedDate var createdAt: LocalDateTime?,
                @LastModifiedDate var updatedAt: LocalDateTime?)