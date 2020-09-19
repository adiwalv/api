package com.adiwal.api.service

import com.adiwal.api.domain.User
import com.adiwal.api.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.stereotype.Service

@Service
public class UserService(private val userRepository: UserRepository) {

    fun findById(id: String) : User? {
        userRepository.findById(id).orElse(throw ResourceNotFoundException("User not found"));
    }
}