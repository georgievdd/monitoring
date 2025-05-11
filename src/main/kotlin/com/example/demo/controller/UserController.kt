package com.example.demo.controller

import com.example.demo.dao.UserDao
import com.example.demo.entity.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val dao: UserDao,
) {
    @PostMapping("/users")
    fun addUser(@RequestBody dto: User): User {
        val saved = dao.save(dto)
        return saved
    }

    @GetMapping("/users")
    fun getUsers(): Iterable<User> {
        return dao.findAll()
    }
}