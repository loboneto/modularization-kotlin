package br.com.example.data.entity.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class NoteDao(
    @ColumnInfo(name = "userId")
    var userId: Int,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "description")
    var description: String,
    @ColumnInfo(name = "createdAt", defaultValue = "CURRENT_TIMESTAMP")
    var createdAt: Long = 0
)
