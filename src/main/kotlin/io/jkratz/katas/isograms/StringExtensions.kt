package io.jkratz.katas.isograms

fun String.isogram(): Boolean {
    val chars: MutableMap<Char, Int> = HashMap()
    this.toLowerCase().toCharArray().forEach { c ->
        if (chars.containsKey(c)) {
            return false
        } else {
            chars[c] = 1
        }
    }
    return true
}