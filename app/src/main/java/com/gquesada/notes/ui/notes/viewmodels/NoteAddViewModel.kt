package com.gquesada.notes.ui.notes.viewmodels

import androidx.lifecycle.ViewModel
import com.gquesada.notes.data.datasources.LocalNoteDataSource
import com.gquesada.notes.data.repositories.NoteRepositoryImp
import com.gquesada.notes.domain.models.NoteModel
import com.gquesada.notes.domain.usecases.AddNoteUseCase

class NoteAddViewModel : ViewModel() {
    private val dataSource = LocalNoteDataSource()
    private val repository = NoteRepositoryImp(dataSource)
    private val addNotesUseCase = AddNoteUseCase(repository)

    fun addNote(note: NoteModel) {//Adding new note
        addNotesUseCase.execute(note)
    }
}