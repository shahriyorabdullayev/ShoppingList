package com.shza.cleanarch1.domain.use_case

import com.shza.cleanarch1.domain.model.ShopItem
import com.shza.cleanarch1.domain.repository.ShoplistRepository

class EditShopItemUseCase(private val shoplistRepository: ShoplistRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shoplistRepository.editShopItem(shopItem)
    }
}