package br.com.example.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.example.data.entity.dao.NoteDao

@Dao
interface NotesDataSource {

    @Query("SELECT * FROM NoteDao WHERE userId = :userId")
    fun getNotes(userId: Int): List<NoteDao>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(noteDao: NoteDao)

    @Query("DELETE FROM NoteDao")
    fun deleteAll()

}
