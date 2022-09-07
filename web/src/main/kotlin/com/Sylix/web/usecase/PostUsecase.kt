package com.Sylix.web.usecase

import com.Sylix.web.domain.Post
import com.Sylix.web.model.ResponsePostList
import com.Sylix.web.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostUsecase {
    @Autowired
    lateinit var service: PostService

    fun getPostList() : ResponsePostList{
        val postList = service.selectPostList()

        return toResponsePostList(postList)
    }


    private fun toResponsePostList(data: List<Post>) =
        ResponsePostList(data = data)
}