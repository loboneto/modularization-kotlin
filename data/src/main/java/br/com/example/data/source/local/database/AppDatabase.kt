package br.com.example.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.example.data.entity.Note
import br.com.example.data.source.local.NotesDataSource

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun notesDataSource(): NotesDataSource
}
