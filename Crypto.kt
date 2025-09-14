package com.example.coinsphere

data class Crypto(
    val id: Int,
    val name: String,
    val price: String,
    val imageUrl: String
)

val sampleCryptoList = listOf(
    Crypto(1, "Bitcoin", "$109,797.37", "https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1696503463"),
    Crypto(2, "Ethereum", "$4,321.21", "https://assets.coingecko.com/coins/images/279/large/ethereum.png?1696503463"),
    Crypto(3, "Tether", "$1.0000", "https://assets.coingecko.com/coins/images/325/large/Tether-logo.png?1696503463"),
    Crypto(4, "XRP", "$2.8100", "https://s2.coinmarketcap.com/static/img/coins/64x64/52.png"),
    Crypto(5, "BNB", "$845.0000", "https://s2.coinmarketcap.com/static/img/coins/64x64/1839.png"),
    Crypto(6, "Solana", "$201.8500", "https://assets.coingecko.com/coins/images/4128/large/solana.png?1696503463"),
    Crypto(7, "USDC", "$0.9998", "https://s2.coinmarketcap.com/static/img/coins/64x64/3408.png"),
    Crypto(8, "Dogecoin", "$0.1320", "https://assets.coingecko.com/coins/images/5/large/dogecoin.png?1696503463"),
    Crypto(9, "TRON", "$0.3630", "https://s2.coinmarketcap.com/static/img/coins/64x64/1958.png")
)