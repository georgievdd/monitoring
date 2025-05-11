package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id


@Entity
data class User(
    @Id @GeneratedValue val id: Long = 0,
    val firstName: String,
    val lastName: String
)
