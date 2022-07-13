package br.com.example.data.repository

import br.com.example.data.entity.Note
import br.com.example.data.source.local.NotesDataSource
import br.com.example.data.util.mapToNoteDao
import br.com.example.data.util.mapToNotes

interface CacheNoteRepository {
    fun getNotes(userId: Int): List<Note>
    fun addNotes(notes: List<Note>)
    fun deleteAll()

}

class CacheNoteRepositoryImpl(private val dataSource: NotesDataSource) : CacheNoteRepository {

    override fun getNotes(userId: Int): List<Note> {
        return dataSource.getNotes(userId).mapToNotes()
    }

    override fun addNotes(notes: List<Note>) {
        dataSource.deleteAll()
        notes.forEach {
            dataSource.addNote(it.mapToNoteDao())
        }
    }

    override fun deleteAll() {
        dataSource.deleteAll()
    }
}
