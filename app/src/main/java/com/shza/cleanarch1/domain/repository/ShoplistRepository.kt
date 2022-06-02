package com.shza.cleanarch1.domain.repository

import androidx.lifecycle.LiveData
import com.shza.cleanarch1.domain.model.ShopItem

interface ShoplistRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}