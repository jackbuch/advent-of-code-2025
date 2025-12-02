package com.github.jackbuch.aoc2025

import java.io.File

object Day1 : Puzzle(day = 1) {
    private val moves =
        File(ClassLoader.getSystemResource("Day1.txt").file)
            .readLines()
            .map { it[0] to it.drop(1).toInt() }

    override fun part1(): Int {
        var position = 50
        var zeroSum = 0

        for ((direction, amount) in moves) {
            val step = if (direction == 'R') 1 else -1

            repeat(amount) {
                position = (position + step) % 100
            }

            if (position == 0) {
                zeroSum++
            }
        }
        return zeroSum
    }

    override fun part2(): Int {
        var position = 50
        var zeroSum = 0

        for ((direction, amount) in moves) {
            val step = if (direction == 'R') 1 else -1

            repeat(amount) {
                position = (position + step) % 100

                if (position == 0) {
                    zeroSum++
                }
            }
        }
        return zeroSum
    }
}