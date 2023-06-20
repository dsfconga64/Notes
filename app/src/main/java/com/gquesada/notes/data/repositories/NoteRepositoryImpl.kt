package com.gquesada.notes.data.repositories

import com.gquesada.notes.data.datasources.LocalNoteDataSource
import com.gquesada.notes.data.mappers.NoteMapper.toLocalNote
import com.gquesada.notes.data.mappers.NoteMapper.toNote
import com.gquesada.notes.domain.models.NoteModel
import com.gquesada.notes.domain.repositories.NoteRepository


class NoteRepositoryImp(
    private val localNotesDataSource: LocalNoteDataSource
): NoteRepository {
    override fun getNotes(): List<NoteModel> {
        return localNotesDataSource.getAllNotes()
            .map { item -> item.toNote() }
    }

    override fun deleteNote(id: Int) {
        localNotesDataSource.deleteNote(id)
    }

    override fun addNote(note: NoteModel) {
        localNotesDataSource.addNote(note.toLocalNote())
    }
}