package com.example.cryptocurrencyapp.domain.use_cases.get_coin

import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoin(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }
        catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unknown error occurred"))
        }
        catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage ?: "Couldn't reach server. Check your internet connection!"))
        }
    }
}