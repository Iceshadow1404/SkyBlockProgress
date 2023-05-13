package at.lorenz.skyblockprogress

import at.lorenz.skyblockprogress.compare.CompareData
import at.lorenz.skyblockprogress.fetch.FetchData
import java.io.File

fun main(args: Array<String>) {
    val apiKey = File("apikey.txt").readText()
    val playerMap = mutableMapOf<String, String>() // player uuid -> profile name

    playerMap["bb855349dfd84125a7505fc2cf543ad5"] = "Zucchini" // hannibal2

    FetchData(apiKey, playerMap)
    CompareData(apiKey, playerMap)
}