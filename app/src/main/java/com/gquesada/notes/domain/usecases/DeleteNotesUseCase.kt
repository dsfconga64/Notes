package com.gquesada.notes.domain.usecases

import com.gquesada.notes.domain.repositories.NoteRepository

class DeleteNotesUseCase(
    private val noteRepository: NoteRepository
) {
    fun execute(id: Int) {
        noteRepository.deleteNote(id)
    }
}