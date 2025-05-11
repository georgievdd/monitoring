package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "\"user\"")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = 0,
    var firstName: String = "",
    var lastName: String = ""
) {
    constructor() : this(Math.random().toLong(), "", "")
}
