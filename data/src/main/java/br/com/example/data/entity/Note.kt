package br.com.example.data.entity

data class Note(
    var id: Int,
    var userId: Int,
    var title: String,
    var description: String,
    var createdAt: Long
)