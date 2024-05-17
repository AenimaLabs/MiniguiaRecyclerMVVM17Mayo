package jorge.andaur.rios.miniguiarecyclermvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jorge.andaur.rios.miniguiarecyclermvvm.model.Item


class ItemViewModel : ViewModel(){

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items


    init {
        // Inicializa con algunos datos
        _items.value = listOf(
            Item(1, "Item 1"),
            Item(2, "Item 2"),
            Item(3, "Item 3")
        )
    }

}