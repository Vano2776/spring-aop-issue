package org.example.springaopissue.services

interface I <T> {
    suspend fun f1(a: T): String
    suspend fun f2(a: T): String
}
