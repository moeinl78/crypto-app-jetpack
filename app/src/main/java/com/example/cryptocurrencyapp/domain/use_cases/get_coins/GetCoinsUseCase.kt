package com.example.cryptocurrencyapp.domain.use_cases.get_coins

import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.domain.model.Coins
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coins>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toItem() }
            emit(Resource.Success(coins))
        }
        catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unknown exception occurred!"))
        }
        catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Make sure you are connected to the internet!"))
        }
    }
}