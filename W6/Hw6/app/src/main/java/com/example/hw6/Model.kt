package com.example.hw6

import kotlin.random.Random

class Model {
    private var secret: Int = 0

    init {
        secret = Random.nextInt(10) + 1
    }

    fun guess(input: Int): String {
        val validate_num = input - secret
        var ans_str: String = "恭喜!你猜對了!!!"
        if (validate_num > 0) {
            ans_str = "你猜太大了!!"
        } else if (validate_num < 0) {
            ans_str = "你猜小了，猜大一些~"
        }
        return ans_str
    }

    fun reset() {
        secret = Random.nextInt(10) + 1
    }
}