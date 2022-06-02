package com.shza.cleanarch1.domain.use_case

import com.shza.cleanarch1.domain.model.ShopItem
import com.shza.cleanarch1.domain.repository.ShoplistRepository

class DeleteShopItemUseCase(private val shoplistRepository: ShoplistRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shoplistRepository.deleteShopItem(shopItem)
    }
}