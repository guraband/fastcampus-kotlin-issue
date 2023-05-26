package reactive

import java.util.concurrent.CompletableFuture

fun main() {
    val completableFuture = CompletableFuture.supplyAsync {
        Thread.sleep(2_000)
        sum(100, 200)
    }

    println("계산 시작")

    completableFuture.thenApplyAsync(::println)

    while (!completableFuture.isDone) {
        Thread.sleep(500)
        println("계산 결과를 집계 중입니다.")
    }

    println("계산 종료")
}

fun sum(a: Int, b: Int) = a + b