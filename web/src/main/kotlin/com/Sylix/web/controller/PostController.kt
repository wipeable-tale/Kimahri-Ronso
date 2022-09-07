package com.Sylix.web.controller

import com.Sylix.web.model.ResponsePostList
import com.Sylix.web.usecase.PostUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {
    @Autowired
    lateinit var usecase: PostUsecase


    @GetMapping("/hello")
    fun hello(): String =
        "hello"

    @GetMapping("/posts")
    fun getPostList() : ResponsePostList =
        usecase.getPostList()

}