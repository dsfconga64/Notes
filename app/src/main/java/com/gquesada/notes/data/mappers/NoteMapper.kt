package com.gquesada.notes.data.mappers

import com.gquesada.notes.data.mappers.TagMapper.toLocalTag
import com.gquesada.notes.data.mappers.TagMapper.toTag
import com.gquesada.notes.data.models.LocalNote
import com.gquesada.notes.domain.models.NoteModel

object NoteMapper {
    fun LocalNote.toNote(): NoteModel {
        return NoteModel(
            id = this.id,
            title = this.title,
            description = this.description,
            tag = this.tag.toTag(),
            date = this.date
        )
    }

    fun NoteModel.toLocalNote(): LocalNote {
        return LocalNote (
            id = this.id,
            title = this.title,
            description = this.description,
            tag = this.tag.toLocalTag(),
            date = this.date
        )
    }
}