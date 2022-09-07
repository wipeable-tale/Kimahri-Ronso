package com.Sylix.web.repository

import com.Sylix.web.repository.entiry.PostEntity
import org.springframework.stereotype.Service

@Service
class PostRepository {

    fun selectAll() :List<PostEntity> = mock()


    // 後から消す
    private fun mock(): List<PostEntity> {
        var mocks : MutableList<PostEntity>  = mutableListOf()
        val mock1 = PostEntity(title = "title1", overview = "概要の説明１")
        val mock2 = PostEntity(title = "title2", overview = "概要の説明１")

        mocks.add(mock1)
        mocks.add(mock2)
        return mocks
    }
}