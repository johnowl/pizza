package com.johnowl.pizza.inventory.model

import org.springframework.stereotype.Component

@Component
class ItemService(val repository: ItemRepository) {
    fun add(item: Item) {
        repository.save(item)
    }

    fun update(id: String, item: Item) {
        repository.save(item)
    }

    fun deleteById(id: String) {
        repository.deleteById(id)
    }
}