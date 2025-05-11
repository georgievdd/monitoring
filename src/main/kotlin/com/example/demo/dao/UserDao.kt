package com.example.demo.dao

import com.example.demo.entity.User
import org.springframework.data.repository.CrudRepository

interface UserDao : CrudRepository<User, Int>
