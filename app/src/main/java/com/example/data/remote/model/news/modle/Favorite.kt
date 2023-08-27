package com.example.data.remote.model.news.modle

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Favorite")
data class Favorite(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val uniCode: String? ,
    val falge: String? ,
    val des : String
)
data class NewFavorite(
    val articles: List<Favorite>
) : Serializable