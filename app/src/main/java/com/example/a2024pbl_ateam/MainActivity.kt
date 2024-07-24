package com.example.a2024pbl_ateam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var noteAdapter: NoteAdapter
    private val notes = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        noteAdapter = NoteAdapter(notes) { position ->
            notes.removeAt(position)
            noteAdapter.notifyItemRemoved(position)
        }

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = noteAdapter
        }

        binding.buttonAdd.setOnClickListener {
            val noteText = binding.editTextNote.text.toString()
            if (noteText.isNotEmpty()) {
                notes.add(noteText)
                noteAdapter.notifyItemInserted(notes.size - 1)
                binding.editTextNote.text.clear()
            }
        }
    }
}
