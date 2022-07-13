package br.com.example.data.repository

import br.com.example.data.entity.Note
import br.com.example.data.entity.dto.NoteDto
import br.com.example.data.source.remote.NoteApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface NoteRepository {
    suspend fun getNotes(userId: Int): List<Note>
    suspend fun addNote(noteDto: NoteDto): Note
    suspend fun updateNote(noteId: Int, noteDto: NoteDto): Note
    suspend fun deleteNote(noteId: Int)
}

class NoteRepositoryImpl(
    private val noteApi: NoteApi
) : NoteRepository {

    override suspend fun getNotes(userId: Int): List<Note> = withContext(Dispatchers.IO) {
        return@withContext noteApi.getNotes(userId)
    }

    override suspend fun addNote(noteDto: NoteDto): Note = withContext(Dispatchers.IO) {
        return@withContext noteApi.addNote(noteDto)
    }

    override suspend fun updateNote(noteId: Int, noteDto: NoteDto): Note =
        withContext(Dispatchers.IO) {
            return@withContext noteApi.updateNote(noteId, noteDto)
        }

    override suspend fun deleteNote(noteId: Int) = withContext(Dispatchers.IO) {
        return@withContext noteApi.deleteNote(noteId)
    }
}
