package com.gquesada.notes.domain.repositories

import com.gquesada.notes.domain.models.NoteModel

interface NoteRepository {

    fun getNotes(): List<NoteModel>
    fun deleteNote(id: Int)
    fun addNote(note: NoteModel)

}