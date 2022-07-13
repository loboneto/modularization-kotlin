package br.com.example.data.source.remote


import br.com.example.data.entity.Note
import br.com.example.data.entity.dto.NoteDto
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface NoteApi {

    @GET
    fun getNotes(userId: Int): List<Note>

    @POST
    fun addNote(noteDto: NoteDto): Note

    @PUT
    fun updateNote(noteId: Int, noteDto: NoteDto): Note

    @DELETE
    fun deleteNote(noteId: Int)

}