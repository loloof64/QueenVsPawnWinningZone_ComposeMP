package com.loloof64.queenvspawnwinningzone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform