package com.gquesada.notes.domain.usecases

import com.gquesada.notes.domain.models.NoteModel
import com.gquesada.notes.domain.repositories.NoteRepository

class AddNoteUseCase(
    private val noteRepository: NoteRepository
) {
    fun execute(note: NoteModel) {
        noteRepository.addNote(note)
    }
}