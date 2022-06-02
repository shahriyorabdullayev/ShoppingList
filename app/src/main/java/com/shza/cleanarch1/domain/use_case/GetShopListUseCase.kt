package com.shza.cleanarch1.domain.use_case

import androidx.lifecycle.LiveData
import com.shza.cleanarch1.domain.model.ShopItem
import com.shza.cleanarch1.domain.repository.ShoplistRepository

class GetShopListUseCase(private val shoplistRepository: ShoplistRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shoplistRepository.getShopList()
    }

}