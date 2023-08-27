package com.example.data.local.dp

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.remote.model.news.modle.Favorite

@Database(entities = [Favorite::class],
          version = 1)
abstract class FavoriteDataBase :RoomDatabase (){
    companion object {

        private lateinit var instance: FavoriteDataBase
        private val Lock = Any()
        fun Application.initArticleDataBase(): FavoriteDataBase {
            return runCatching { instance }.getOrElse {
                synchronized(Lock) {
                    createDatabase(this).also { instance = it }
                }
            }


        }

        fun getInstance() = instance

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                    context.applicationContext,
                    FavoriteDataBase::class.java,
                    "article_db.db"
            ).build()
    }
}