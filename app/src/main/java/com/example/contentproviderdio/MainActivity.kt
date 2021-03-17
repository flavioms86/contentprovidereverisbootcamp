package com.example.contentproviderdio

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import androidx.recyclerview.widget.RecyclerView
import com.example.contentproviderdio.database.NotesDatabaseHelper.Companion.TITLE_NOTES
import com.example.contentproviderdio.database.NotesProvider.Companion.URI_NOTES
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<Cursor> {

    lateinit var noteRecyclerView: RecyclerView
    lateinit var noteAdd: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteAdd = findViewById(R.id.note_add)
        noteAdd.setOnClickListener {  }

        noteRecyclerView = findViewById(R.id.notes_recycler)
    }

    //Instancia o que sera buscado - pesquisa no content provider
    override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> {
        CursorLoader(this, URI_NOTES, null, null, null, TITLE_NOTES)
    }
    //pegar os dados recebidos para manipulação
    override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
        if (data != null) {}
    }
    //mata a pesquisa em segundo plano do loadmanager
    override fun onLoaderReset(loader: Loader<Cursor>) {
        TODO("Not yet implemented")
    }
}