package com.github.jackbuch.aoc2025

/**
 * @author Jack | Dec 01 2025 | github.com/jackbuch
 */
abstract class Puzzle(private val day: Int) {
    abstract fun part1(): Any

    abstract fun part2(): Any

    fun solve() {
        println("Day $day Part 1 - ${part1()}")
        println("Day $day Part 2 - ${part2()}")
    }
}