package com.shza.cleanarch1.domain.use_case

import com.shza.cleanarch1.domain.model.ShopItem
import com.shza.cleanarch1.domain.repository.ShoplistRepository

class AddShopItemUseCase(private val shoplistRepository: ShoplistRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shoplistRepository.addShopItem(shopItem)

    }
}