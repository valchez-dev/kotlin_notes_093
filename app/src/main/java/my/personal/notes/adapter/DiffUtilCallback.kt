package my.personal.notes.adapter

import androidx.recyclerview.widget.DiffUtil
import my.personal.notes.database.model.Note

class DiffUtilCallback : DiffUtil.ItemCallback<Note>() {


    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id == newItem.id
    }


}