package com.Sylix.web.service

import com.Sylix.web.domain.Post
import com.Sylix.web.repository.PostRepository
import com.Sylix.web.repository.entiry.PostEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostServiceImpl : PostService{
    @Autowired
    lateinit var repository: PostRepository

    override fun selectPostList(): List<Post> {
        val data = repository.selectAll()

        return  data.map { toPost(it) }
    }


    private fun toPost(entity: PostEntity) :Post=
        Post(
            title = entity.title,
            overview = entity.overview
        )
}