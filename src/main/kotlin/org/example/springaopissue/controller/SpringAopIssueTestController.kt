package org.example.springaopissue.controller

import org.example.springaopissue.model.SomeClass
import org.example.springaopissue.services.I
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/aop-issue-test")
class SpringAopIssueTestController(
    private val someService: I<SomeClass>
) {

    @GetMapping("/f1")
    suspend fun f1(): String {
        return someService.f1(SomeClass()) //call without error
    }

    @GetMapping("/f2")
    suspend fun f2(): String {
        return someService.f2(SomeClass()) //call with error
    }
}