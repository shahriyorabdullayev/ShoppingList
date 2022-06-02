package com.shza.cleanarch1.domain.use_case

import com.shza.cleanarch1.domain.model.ShopItem
import com.shza.cleanarch1.domain.repository.ShoplistRepository

class GetShopItemUseCase(private val shoplistRepository: ShoplistRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shoplistRepository.getShopItem(shopItemId)
    }
}