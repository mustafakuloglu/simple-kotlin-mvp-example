package com.kuloglu.kotlinmvp

import com.kuloglu.kotlinmvp.util.SumUtil
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val sumUtil=SumUtil()
    @Test
    fun addition_isCorrect() {
        assertEquals(5, sumUtil.sum(2,3))
        assertEquals(5, sumUtil.minus(2,3))
    }

}
