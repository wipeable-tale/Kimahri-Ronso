package com.Sylix.web.service

import com.Sylix.web.domain.Post
import org.springframework.stereotype.Service

interface PostService {
    fun selectPostList(): List<Post>
}