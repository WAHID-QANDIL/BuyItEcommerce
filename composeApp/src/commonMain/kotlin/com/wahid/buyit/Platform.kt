package com.wahid.buyit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform