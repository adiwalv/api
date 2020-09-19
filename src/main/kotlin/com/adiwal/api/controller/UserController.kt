package com.adiwal.api.controller

import com.adiwal.api.domain.User
import com.adiwal.api.repository.UserRepository
import com.adiwal.api.service.UserService
import lombok.extern.slf4j.Slf4j
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
class UserController(private val userRepository: UserRepository, private val userService: UserService) {

    @PutMapping("/user/{id}")
    fun put(@PathVariable id: String, @RequestBody requestBody: User) {
        print("path id $id")
        val user = userService.findById(id)
        if (user != null) {
            user.name = requestBody.name
        }
        userRepository.save(user!!)
    }
}