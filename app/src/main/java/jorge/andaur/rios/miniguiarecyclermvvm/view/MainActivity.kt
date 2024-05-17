package jorge.andaur.rios.miniguiarecyclermvvm.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import jorge.andaur.rios.miniguiarecyclermvvm.R
import jorge.andaur.rios.miniguiarecyclermvvm.view.adapter.ItemAdapter
import jorge.andaur.rios.miniguiarecyclermvvm.viewmodel.ItemViewModel


class MainActivity : AppCompatActivity() {

    private val viewModel: ItemViewModel by viewModels()
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        adapter = ItemAdapter(emptyList())
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        viewModel.items.observe(this, Observer { items ->
            adapter.updateItems(items)
        })
    }
}