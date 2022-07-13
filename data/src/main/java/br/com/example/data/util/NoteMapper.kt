package br.com.example.data.util

import br.com.example.data.entity.Note
import br.com.example.data.entity.dao.NoteDao

fun NoteDao.mapToNote(): Note {
    return Note(id, userId, title, description, createdAt)
}

fun List<NoteDao>.mapToNotes(): List<Note> {
   return map { it.mapToNote() }
}

fun Note.mapToNoteDao(): NoteDao {
    return NoteDao(userId, id, title, description, createdAt)
}
