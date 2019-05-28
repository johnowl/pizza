package com.johnowl.pizza.inventory.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Item(@Id val id: String,
                var name: String,
                val amount: Long,
                var price: Double)