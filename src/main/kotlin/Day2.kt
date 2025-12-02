package com.github.jackbuch.aoc2025

import java.io.File

object Day2 : Puzzle(day = 2) {
    private val ids =
        File(ClassLoader.getSystemResource("Day2.txt").file)
            .readLines()
            .flatMap { it.split(",") }

    override fun part1(): Any {
        var invalid = 0L
        for (range in ids) {
            val (start, end) = range.split("-")
            for (id in start.toLong()..end.toLong()) {
                val stringId = id.toString()
                if (stringId.length % 2 != 0) {
                    continue
                }
                val half = stringId.length / 2
                val firstHalf = stringId.take(half)
                val lastHalf = stringId.takeLast(half)
                if (firstHalf == lastHalf) {
                    invalid += id
                }
            }
        }
        return invalid
    }

    override fun part2(): Any {
        var invalid = 0L
        for (range in ids) {
            val (start, end) = range.split("-")
            for (id in start.toLong()..end.toLong()) {
                val stringId = id.toString()
                val length = stringId.length
                for (patternLength in 1..(length / 2)) {
                    val pattern = stringId.take(patternLength)
                    val repeatCount = length / patternLength

                    if (pattern.repeat(repeatCount) == stringId) {
                        invalid += id
                        break
                    }
                }
            }
        }
        return invalid
    }
}