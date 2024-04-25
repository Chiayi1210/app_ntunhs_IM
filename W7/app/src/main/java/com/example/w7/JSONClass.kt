package com.example.w7
data class kpop(
    val singers: List<Singer>
)

data class Singer(
    val agency: String,
    val name: String,
    val year of debut: Int
)